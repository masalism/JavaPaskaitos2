package Listai;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPvz {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(34);
        numbers.add(3);
        numbers.add(4);
        numbers.add(34);
        numbers.add(56);
        numbers.add(78);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);

        numbers.forEach(System.out::println);

        //Person klases visa info
        Set<Person> persons = new TreeSet<>();

        persons.add(new Person("Mantas", "Masalis"));
        persons.add(new Person("Mantas", "Masalis"));
        persons.add(new Person("Darius", "Tulauskas"));
        Person p = new Person("Andrius", "Baltrunas");
        persons.add(p);

        persons.forEach(pp -> {
            System.out.println("Vardas " + pp.getName() + " Pavarde " + pp.getSurname());
        });
    }
}
