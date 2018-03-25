package Listai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotistestas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite pirma skaciu");
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
        }

    }

    private static double suma(double a, double b) { return a + b; }

    private static double skirtumas(double a, double b) { return a - b; }

    private static double getCorrectNumber(Scanner sc) {
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
    }
}
