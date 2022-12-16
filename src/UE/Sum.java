package UE;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumUpRecursive(5));

    }
    public static int sumUPiterativ (int n){
        int a = 0;
        for (int i = 1; i<=n; i++) {
            a = a+i;

        }

        return a;
    }
    public static int sumUpRecursiveAcc(int n, int acc){
        if(n <= 0){
            return acc;
        }
        acc = acc + n;
        return sumUpRecursiveAcc(n-1,acc);
    }
    public static int sumUpRecursive(int n){
        if(n<=0){
            return n;
        }

        return n + sumUpRecursive(n-1);
    }
}
