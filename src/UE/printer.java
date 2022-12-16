package UE;

public class printer {
    public static void main(String[] args) {
        printfromZeroToNRecursive2(5);

    }

    /*
    public static void printFromNToZero(int n){

        while(n>=0)

    public static void main(String[] args) {
        printFromNToZero(5);
    }
        */



    public static void printfromNToZeroRecursive(int n) {
        // Abbruchskriterium
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);
        // rufe die Methode ein weiteres Mal auf
        printfromNToZeroRecursive(n - 1);
    }
    public static void printfromZeroToNRecursive(int n) {
        // Abbruchskriterium


        // rufe die Methode ein weiteres Mal auf
        int b = 0;
        printer.printfromZeroToNRecursive(n,b);
    }
    public static void printfromZeroToNRecursive2(int n) {
        // Abbruchskriterium
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);
        printfromNToZeroRecursive(n - 1);


    }

    public static void printfromZeroToNRecursive(int n, int b) {
        // Abbruchskriterium
        if (b > n) {
            return;
        }
        System.out.println("n = " + b);
        // rufe die Methode ein weiteres Mal auf
        printer.printfromZeroToNRecursive(n,++b);
    }
}
