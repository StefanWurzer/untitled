package createNewSocialMedia;

public class Profile {
   private String eMail;
   private int age;
   private String fullName;
   private Maybe<String> creditCardNumber;

   //Klasse Double macht aus einen primitiven Datentyp eine Klasse (Wrapper)
   private Maybe<Double> salary;
   private Profile bestFriend;


    public Profile(String eMail, int age, String fullName, String creditCardNumber, double salary) {
        this.eMail = eMail;
        this.age = age;
        this.fullName = fullName;
        this.creditCardNumber = new Maybe(creditCardNumber);
        this.salary = new Maybe<Double>(salary);
    }

    public void printPublicPage(AccessRoles role){
       /*
        System.out.println("My Profile");

        System.out.println("Name: "+fullName);
        if(role == AccessRoles.Platform) {
            System.out.println("eMail = " + eMail);
            System.out.println("age= " + age);
        }
        if(role == AccessRoles.Self) {
            System.out.println("creditCardNumber = " + creditCardNumber);
            Syst
            */
        creditCardNumber.deliverValue(role);
    }

    public void setBestFriend(Profile bestFriend) {
        this.bestFriend = bestFriend;
    }

    public void getBestFriend() {
        //bestFriend.printPublicPage();
    }

    public String toString() {
        return "Profile{" +
                "eMail='" + eMail + '\'' +
                ", age=" + age +
                ", fullName='" + fullName + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", salary=" + salary +
                ", bestFriend=" + bestFriend.fullName +
                '}';
    }
}
