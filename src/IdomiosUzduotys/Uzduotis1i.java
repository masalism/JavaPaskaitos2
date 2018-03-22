package IdomiosUzduotys;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Uzduotis1i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String zodis;

        do {
            System.out.println("Iveskite zodi, jei ivesite - Pabaiga - programa baigs darba");
            zodis = sc.nextLine();
            if (zodis.length() % 2 == 0) {
                System.out.println(zodis + " " + zodis.length() + " zodis lyginis");
            } else if (zodis.length() % 2 != 0) {
                System.out.println(zodis + " " + zodis.length() + " zodis nelyginis");
            }
        } while (zodis == "Pabaiga");*/

        while (true) {
            System.out.println("Iveskite zodi, jei ivesite - Pabaiga - programa baigs darba");
            String zodis = sc.nextLine();
            if (zodis.toLowerCase().equals("pabaiga")) {
                break;
            }
            if (zodis.length() % 2 == 0) {
                System.out.println(zodis + " " + zodis.length() + " zodis lyginis");
            } else {
                System.out.println(zodis + " " + zodis.length() + " zodis nelyginis");
            }

            char letter = 'a';
            System.out.println("Radome " + letter + " raidziu " + countHowLettersHaveWord(zodis, letter));

            System.out.println();
        }


    }

    private static int countHowLettersHaveWord(String zodis, char letter) {
        int count = 0;

        for (int i = 0; i < zodis.length(); i++) {
            if (zodis.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
