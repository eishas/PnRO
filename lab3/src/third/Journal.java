package third;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

public class Journal {
    private ArrayList<third.Group> groups;

    public Journal(ArrayList<third.Group> groups){
        this.groups = groups;
    }

    public void setMark(int weekNumber, int groupId, int studentId, int mark){
        Student student = groups.stream().filter(x->x.getId()==groupId).findFirst().orElse(null).getStudentById(studentId);
        student.setMark(mark,weekNumber);
        System.out.println("Week " + weekNumber);
        for(int g=0;g<groups.size();g++){
            groups.get(g).print();
        }
        System.out.println();
    }

    public synchronized void print(int id, int i){

    }
}
