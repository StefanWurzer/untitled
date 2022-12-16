package listenUndDu;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        //STRG + ALT + V
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(10);

        System.out.println(integers.size());
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hallo");
        System.out.println(strings.size());

        boolean contains = integers.contains(3);
        System.out.println(contains);

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("Zahl =" + integers.get(i));

        }
        for (int number : integers){
            System.out.println("nummer =" + number);
        }

    }

}
