package listenUndDu;

import java.util.HashSet;

public class StudentSetDEmo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Student susi = new Student(1003, "Susi sorglos");
        Student klaus = new Student(1004, "Klaus");
        Student fritz = new Student(1005, "Fritz");
        Student jörg = new Student(1006, "Jörg");

        students.add(susi);
        students.add(susi);

        //students.remove(susi);

        for (Student n : students){
           if(n.equals(susi)) {
               System.out.println("true");
           }
           else {
               System.out.println("nope");
           }

            for (Student b : students){
                System.out.println(n.toString());
            }

        }




    }




}

