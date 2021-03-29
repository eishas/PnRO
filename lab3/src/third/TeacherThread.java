package third;


import java.util.ArrayList;


class TeacherThread extends Thread {
    private int id;
    private third.Journal journal;
    private int weeksNumber;
    private ArrayList<Integer> GroupN;

    public TeacherThread(third.Journal journal, int weeksNumber, int id, ArrayList<Integer> GroupN){
        this.journal  = journal;
        this.weeksNumber = weeksNumber;
        this.id = id;
        this.GroupN = GroupN;
    }
    public void run(){
        for (int i =0;i<weeksNumber;i++){
            for(int j = 0;j<3;j++){
                for(int k = 0;k<5;k++){
                    int mark = 50;
                    boolean flag = false;
                    for (Integer integer : GroupN) {
                        if (integer.equals(j))
                            flag = true;
                    }
                    if (flag) {
                        journal.setMark(i, j, k, mark);
                    }
                }
            }
            journal.print(id, i);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}