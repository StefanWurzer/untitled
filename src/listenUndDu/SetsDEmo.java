package listenUndDu;

import java.util.HashSet;

public class SetsDEmo {
    public static void main(String[] args) {
        HashSet<String> strings= new HashSet<>();
        strings.add("Hallo");
        strings.add("Servus");

        strings.add("Hallo");
        System.out.println(strings.size());
        //STRG + Alt + V

        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Jörg","Haider"));
        people.add(new Person("Stefan","Petzner"));
        people.add(new Person("Gerhard","Dörfler"));

        System.out.println(people);


    }
}

