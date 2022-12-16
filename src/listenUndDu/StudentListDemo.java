package listenUndDu;

import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {

        ArrayList<Student> studentenListe = new ArrayList<>();

        Student susi = new Student(1003, "Susi sorglos");
        Student klaus = new Student(1004, "Klaus");
        Student fritz = new Student(1005, "Fritz");
        Student jörg = new Student(1006, "Jörg");

        studentenListe.add(new Student(1006, "Paul"));
        studentenListe.add(klaus);
        studentenListe.add(fritz);
        studentenListe.add(jörg);

        studentenListe.remove(susi);

        for (int i = 0; i < studentenListe.size(); i++) {

            System.out.println(studentenListe.get(i).toString());

        }
        if (klaus.equals(klaus)) {
            System.out.println("geh Scheißn klaus");
        }

        if(containsName(studentenListe, "Paul")){
            System.out.println("ja");
        }
        else {
            System.out.println("no");
        }
        if(containsMatrNr(studentenListe, 1004)){
            System.out.println("ja");
        }
        else {
            System.out.println("no");
        }
    }
        public static boolean containsName(ArrayList<Student> studentenListe, String searchname){
            for (int i = 0; i < studentenListe.size(); i++) {
                Student student = studentenListe.get(i);
                if (student.getFullName().equals(searchname)) {
                    return true;


                }
            }
            return false;


    }
    public static boolean containsMatrNr(ArrayList<Student> studentenListe, int MatNr){
        //for each Schleife
        for (Student student : studentenListe) {

            if (student.getMatNr() == MatNr) {
                return true;


            }
        }
        return false;


    }



}
