package Listai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListuPvz {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>(); //paprasciausias, kurti sita dazniausiai

        names.add("Mantas");
        names.add("Gabija");
        names.add("Andrius");
        names.add("Gabija");
        names.add(2, "Andrius");


        //kad atvaizduotu visa lista
        for (String name : names) {
            System.out.println(name);
        }

        //kiek yra elementu
        System.out.println(names.size());
        //patikrina ar ne tuscias
        System.out.println(names.isEmpty());
        //grazina 2 reiksme liste
        System.out.println(names.get(1));
        System.out.println(names);

        numbers.add(12);
        numbers.add(1);
        numbers.add(22);
        numbers.add(13);
        numbers.add(65);
        numbers.add(34);

        //rusoiuoti lista
        Collections.sort(numbers);

        //listo spausdinimas, nuo 8 java
        numbers.forEach(System.out::println);
        //a -> nurodo ka ta reiksme darys toliau
        names.forEach(a -> System.out.println("Index " + names.indexOf(a) + " reiksmes " + a));

    }
}
