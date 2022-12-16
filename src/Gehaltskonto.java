public class Gehaltskonto {
    private String inhaber;
    private String IBAN;
    private String BIC;
    private double kontostand;
    // static sind statische Attribute, die auf Klassenebene existieren
    public static int counter = 0;
    private int fortlaufendeNummer;

    public Gehaltskonto(String inhaber, String IBAN, String BIC) {
        this.inhaber = inhaber;
        this.IBAN = IBAN;
        this.BIC = BIC;
        kontostand = 0.0;
        this.counter++;
        this.fortlaufendeNummer = counter;
    }

    public void aufbuchen(double wert){
        kontostand = kontostand + wert;
        System.out.println("succesful");
    }
    public void abbuchen(double wert){
        if(wert<=kontostand) {
            kontostand = kontostand - wert;
        }else{
            System.out.println("invalid booking");
        }
    }

    public double getKontostand2(){
        return kontostand;
    }


    public String toString() {
        return " Gehaltskonto[" +
                "inhaber='" + inhaber + '\'' +
                "counter='" + counter + '\'' +
                "fortlaufende Nummer='" + fortlaufendeNummer + '\'' +
                ", IBAN='" + IBAN + '\'' +
                ", BIC='" + BIC + '\'' +
                ", kontostand=" + kontostand +
                ']';
    }
}
