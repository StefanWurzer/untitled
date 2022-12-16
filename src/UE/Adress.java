package UE;

public class Adress {
    private String Street;
    private String ZIP;
    private String City;
    private String county;

    public Adress(String street, String ZIP, String city, String county) {
        Street = street;
        this.ZIP = ZIP;
        City = city;
        this.county = county;

    }


    @Override
    public String toString() {
        return "Adress{" +
                "Street='" + Street + '\'' +
                ", ZIP='" + ZIP + '\'' +
                ", City='" + City + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
