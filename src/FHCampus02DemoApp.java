public class FHCampus02DemoApp {
    public static void main(String[] args) {
        Student student = new Student(1, "max","mustermann");

        student.setFirstName("susi");
        student.setLastName("Sorglos");
        student.setNumber(1);
        student.setUserName("sSorglos");
// um zu der Methode in der anderen Klasse zu springen mit STRG auf die Methode klicken
        System.out.println("student.toString() = " + student.toString());
        Student student2 = new Student(2, "max", "mustermann");
        //student2.initialize(2, "max", "mustermann");
        System.out.println("student2.toString() = " + student2.toString());

        Student student3 = new Student(3, "max", "mustermann");

    }
}
