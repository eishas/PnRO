package third;


import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;


public class JournalTest {
    public static void main(String[] args) {
        int weeksNumber = 7;
        third.Journal journal = new third.Journal(createGroups(weeksNumber));

        ArrayList<Integer> GroupN = new ArrayList<Integer>();
        GroupN.add(0);
        GroupN.add(1);
        GroupN.add(2);
        TeacherThread lecture = new TeacherThread(journal,weeksNumber,0,GroupN);
        lecture.start();
        for(int i = 0;i<1;i++){
            ArrayList<Integer> GroupN1 = new ArrayList<Integer>();
            GroupN1.add(0);
            TeacherThread t1 = new TeacherThread(journal,weeksNumber,i+1,GroupN1);
            t1.start();
        }
        for(int i = 0;i<1;i++){
            ArrayList<Integer> GroupN2 = new ArrayList<Integer>();
            GroupN2.add(1);
            TeacherThread t2 = new TeacherThread(journal,weeksNumber,i+2,GroupN2);
            t2.start();
        }
        for(int i = 0;i<1;i++){
            ArrayList<Integer> GroupN3 = new ArrayList<Integer>();
            GroupN3.add(2);
            TeacherThread t3 = new TeacherThread(journal,weeksNumber,i+3,GroupN3);
            t3.start();
        }
    }

    public static ArrayList<third.Group> createGroups(int weeksNumber){
        ArrayList<third.Group> groups = new ArrayList<>();

        //group1
        Student s0 = new Student(0, weeksNumber);
        Student s1 = new Student(1, weeksNumber);
        Student s2 = new Student(2, weeksNumber);
        Student s3 = new Student(3, weeksNumber);
        Student s4 = new Student(4, weeksNumber);
        ArrayList<Student> students0 = new ArrayList<>();
        students0.add(s0); students0.add(s1); students0.add(s2); students0.add(s3); students0.add(s4);
        third.Group group0 = new third.Group(0, students0);

        //group2
        Student s5 = new Student(0, weeksNumber);
        Student s6 = new Student(1, weeksNumber);
        Student s7 = new Student(2, weeksNumber);
        Student s8 = new Student(3, weeksNumber);
        Student s9 = new Student(4, weeksNumber);
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(s5); students1.add(s6); students1.add(s7); students1.add(s8); students1.add(s9);
        third.Group group1 = new third.Group(1, students1);

        //group3
        Student s10 = new Student(0, weeksNumber);
        Student s11 = new Student(1, weeksNumber);
        Student s12 = new Student(2, weeksNumber);
        Student s13 = new Student(3, weeksNumber);
        Student s14 = new Student(4, weeksNumber);
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(s10); students2.add(s11); students2.add(s12); students2.add(s13); students2.add(s14);
        third.Group group2 = new third.Group(2, students2);

        groups.add(group0);
        groups.add(group1);
        groups.add(group2);

        return groups;
    }
}
