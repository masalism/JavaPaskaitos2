package Listai;

import java.util.ArrayList;

public class Uzduotis1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mantas");
        names.add("Indre");
        names.add("Jonas");
        names.add("Petras");
        names.add("Gabriele");
        names.add("Aurelija");

        for (String name : names) {
            if (name.length() > 5){
                System.out.println(name);
            }
        }

    }
}
