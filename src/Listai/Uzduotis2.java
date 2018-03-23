package Listai;

import java.util.ArrayList;
import java.util.List;

public class Uzduotis2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mantas");
        names.add("Indre");
        names.add("Jonas");
        names.add("Petras");
        names.add("Gabriele");
        names.add("Aurelija");

        System.out.println(firstName(names));
        System.out.println(lastName(names));


    }
    private static String firstName (List<String> names){
        return names.get(0);
    }

    private static String lastName (List<String> names){
        return names.get(names.size()-1);
    }
}
