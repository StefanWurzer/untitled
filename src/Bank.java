public class Bank {
    public static void main(String[] args) {
        Gehaltskonto konto1 = new Gehaltskonto("Jörg", "1990", "1990");
        Gehaltskonto konto2 = new Gehaltskonto("Thomas", "1992", "1992");
        Gehaltskonto konto3 = new Gehaltskonto("Kathrin", "1994", "1994");

        konto2.aufbuchen(150.0);
        konto3.aufbuchen(5000.0);
        konto1.aufbuchen(200.0);
        konto1.abbuchen(300.0);

        //System.out.println("konto1.getKontostand2() = " + konto1.getKontostand2());
        //System.out.println("konto2.getKontostand2() = " + konto2.getKontostand2());
        //System.out.println("konto3.getKontostand2() = " + konto3.getKontostand2());

        Gehaltskonto[] alleKonten = {konto1, konto2, konto3};
        System.out.println();
        for (int i = 0; i < alleKonten.length; i++) {
            System.out.println("konto " +i+  alleKonten[i].toString());
        }
    //Übungen mit static
        konto1.counter =3;
        // Variable counter ist auf Klassenebene, nicht auf Objektebene deswegen wird es nicht vorgeschlagen
        Gehaltskonto.counter = 3;
                //auf der Klassenebene wird es vorgschlagen
        System.out.println("Gehaltskonto.counter = " + Gehaltskonto.counter);


    }
}
