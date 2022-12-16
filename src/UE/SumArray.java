package UE;

import java.util.ArrayList;

public class SumArray {
    public static void main(String[] args) {
        ArrayList<Integer> x= new ArrayList<>();
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        x.add(4);
        System.out.println(SummeRecursive(x));


    }

    public static int SummeIterativ(ArrayList<Integer> n){
        int a=0;
        int i = 0;
        while(i < n.size()) {
            a += n.get(i);
            n.remove(i);
        }
        return a;
    }
    public static int SummeRecursive(ArrayList<Integer> n){
        int a = 0;
        a = n.get(n.size());
        n.remove(n.size());
        if(n.size() == 2) {
            n.remove(1);
            return n.get(0);
        }

       return a + SummeRecursive(n);







    }
}
