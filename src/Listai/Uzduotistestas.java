package Listai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotistestas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] items;
        while (true) {
            System.out.println("Iveskite du skaicius ir tarpa tarp ju");
            String line = sc.nextLine();
            items = line.split(" "); //splitina itemus
            if (items.length == 3) {
                if (items[1].equals("+") || items[1].equals("-"))
                    break;
            }
        }

        int a = getCorrectNumber(items[0], sc, false);
        int b = getCorrectNumber(items[2], sc, true);

        switch (items[1]) {
            case "+":
                suma(a, b);
                break;
            case "-":
                skirtumas(a, b);
                break;
        }
        /*System.out.println("Irasykite pirma skaciu");
        double a = getCorrectNumber(sc);
        System.out.println("Iveskite zenkla ka norite daryti: +/-");
        char zenklas = sc.next(".").charAt(0);
        System.out.println("Iveskite antra skaiciu");
        double b = getCorrectNumber(sc);

        while (b == 0) {
            System.out.println("Skaiciaus 0 negali buti, iveskite kita skaiciu");
            b = sc.nextDouble();
        }

        switch (zenklas) {
            case '+':
                System.out.println(a + " " + zenklas + " " + b + " = " + suma(a, b));
                break;
            case '-':
                System.out.println(a + " " + zenklas + " " + b + " = " + skirtumas(a, b));
                break;
            default:
                System.out.println("Ivestas ne tas zenklas");
                break;
        }*/
    }

    private static void suma(int numb1, int numb2) {
        System.out.println("suma " + (numb1 + numb2));
    }

    private static void skirtumas(int numb1, int numb2) {
        System.out.println("skirtumas " + (numb1 - numb2));
    }

    private static int getCorrectNumber(String numb, Scanner sc, boolean isSecondNumb) {
        int result = 0;
        try {
            result = Integer.valueOf(numb);
            if (isSecondNumb && result == 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            result = getResult(sc, isSecondNumb);
        }
        return result;
    }

    private static int getResult(Scanner sc, boolean isSecondNumb) {
        int result;
        while (true) {
            String numbPosition = isSecondNumb ? "antra" : "pirma";
            System.out.println("Blogas skaicius, iveskite " + numbPosition + " nauja skaiciu");
            try {
                result = sc.nextInt();
                if ((isSecondNumb && result != 0) || !isSecondNumb) {
                    break;
                }
            } catch (InputMismatchException ex) {
                sc.nextLine();
            }
        }
        return result;
    }

    /*private static double getCorrectNumber(Scanner sc) {
        double result = 0.0;
        while (true) {
            try {
                result = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ivestas ne skaicius, bandykite dar karta ivesti skaiciu");
                sc.nextLine();
            }
        }
        return result;
    }*/
}
