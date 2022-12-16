public class BruchRechnung {
    public static void main(String[] args) {
        Bruch nummer1 = new Bruch(1,4);

        System.out.println(nummer1.toDezimal());
        nummer1.print();

        Bruch nummer2 = new Bruch(2,5);
        System.out.println(nummer2.toDezimal());
        nummer2.print();
        Bruch result = nummer1.multiplkation(nummer2);
        result.print();
    }



}
