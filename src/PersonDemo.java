public class PersonDemo {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Person susi; //Ein Objekt von Person für Susi
        susi = new Person();
        susi.uniqueID = 4711;
        susi.firstName = "Susi";
        susi.lastName = "Sorglos";
        susi.age = 23;
        susi.mailAddress = "whocares@campus02.at";

        //Klassen können wie Datentpen verwendet werde
        // Man kann darauf zugreifen in dem man einen Punkt nach der Bezeichnung macht

        Person max = new Person();
        max.uniqueID = 2511;
        max.firstName = "Max";
        max.lastName = "Mustermann";
        max.age = 75;
        max.mailAddress = "whocares@campus02.at";

        print2Person(max,susi);
        max.print();
        susi.print();
        System.out.println("max.fullName() = " + max.fullName());
        //susi.setlastName(max.lastName);
        System.out.println("susi.age = " + susi.age);

    }
    public static void print2Person(Person mensch1, Person mensch2){
        printPerson(mensch1);
        printPerson(mensch2);
    }
    public static void printPerson(Person mensch){
        System.out.println("person.uniqueID = " + mensch.uniqueID);
        System.out.println("person.firstname = " + mensch.firstName);
        System.out.println("person.lastName = " + mensch.lastName);
        System.out.println("person.age = " + mensch.age);
        System.out.println("person.mailAddress = " + mensch.mailAddress);

    }
}
