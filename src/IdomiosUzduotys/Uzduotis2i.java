package IdomiosUzduotys;

import java.util.Scanner;

public class Uzduotis2i {
    public static void main(String[] args) {
        System.out.println("Iveskite zodzius");
        Scanner sc = new Scanner(System.in);
        String zodziai = sc.nextLine();

        //System.out.println(arPalindromas(zodziai));


        for (int i = 0; i < zodziai.length(); i++) {
            char pradzia = zodziai.charAt(i);
            char galas = zodziai.charAt(zodziai.length() - 1 - i);
            if (arPalindromas(zodziai)) {
                System.out.println("zodis polindromas");
            } else {
                System.out.println("Zodis nepolindromas");
            }
        }
    }

    private static boolean arPalindromas(String zodziai) {
        boolean result = true;
        for (int i = 0; i < zodziai.length(); i++) {
            if (zodziai.charAt(i) != zodziai.charAt(zodziai.length() - 1 - i)) {
                result = false;
                break;
            }

        }
        return result;
    }
}
 /*String myWord = zodziai.replaceAll(" ", "");
        String reverse = new StringBuffer(myWord).reverse().toString();
        return reverse.equalsIgnoreCase(myWord);*/