package UE;

import java.util.ArrayList;

public class Customer {
    private int customerNumber;
    private ArrayList<Adress> Adresses;

    public Customer(int customerNumber) {
        this.customerNumber = customerNumber;
        ArrayList<Adress> b= new ArrayList<>();
    }

    public void addAddrese(Adress a){
         Adresses.add(a);
    }
}

