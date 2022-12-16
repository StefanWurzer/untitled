public class Person {
    //Unsere Klasse haben keine main-Methode
    public int uniqueID;
    public String firstName;
    public String lastName;
    public int age;
    public String mailAddress;

    //Methoden innerhalb der Klasse sind meist nicht static!
    public void print() {
        System.out.println("uniqueID = " + uniqueID);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("age = " + age);
        System.out.println("mailAddress = " + mailAddress);

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Person{" +
                "uniqueID=" + uniqueID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }

    public String fullName(){
        return firstName + " " + lastName.toUpperCase();

    }
    public void changeAge(int newAge){
        if(newAge > age){
            age = newAge;
        }

    }
}
