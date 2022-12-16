public class Bruch {
    private int zaehler;
    private int nenner;
    private double dezimalZahl;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;

    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public double toDezimal() {
        return (zaehler * 1.0) / (nenner * 1.0);

    }

    public void print() {
        System.out.println(zaehler + " / " + nenner);
    }
    public Bruch multiplkation(Bruch nummer1){
        int neuerZaehler = nummer1.zaehler * zaehler;
        int neuerNenner = nummer1.nenner * nenner;
        Bruch result = new Bruch(neuerZaehler,neuerNenner);
        return result;
    }
    public Bruch multiplikation(Bruch f1,Bruch f2){
        return multiplkation(f2).multiplkation(f1);
    }

}
