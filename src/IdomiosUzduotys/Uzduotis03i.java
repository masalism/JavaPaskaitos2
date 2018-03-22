package IdomiosUzduotys;

import java.util.Scanner;

public class Uzduotis03i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pasirinkimas = 0;

        while (true) {
            System.out.println("Iveskite skaiciu ka norite skaiciuoti");
            System.out.println("1 - staciojo trikampio plotas");
            System.out.println("2 - staciakampio plotas");
            System.out.println("3 - kvadrato plotas");
            System.out.println("4 - apskritimo plotas");
            System.out.println("0 - baiga darba");
            pasirinkimas = sc.nextInt();
            if (pasirinkimas == 1) {
                System.out.println("Iveskite staciojo trikampio 2 krastines");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(trikampioPlotas(a, b));
            } else if (pasirinkimas == 2) {
                System.out.println("Iveskite staciakampio ploti ir ilgi");
                int c = sc.nextInt();
                int d = sc.nextInt();
                System.out.println(staciakampioPlotas(c, d));
            } else if (pasirinkimas == 3) {
                System.out.println("Iveskite viena krastine");
                int e = sc.nextInt();
                System.out.println(kvadratoPlotas(e));
            } else if (pasirinkimas == 4) {
                System.out.println("Iveskite spindulio ilgi");
                double f = sc.nextDouble();
                System.out.println(apskritimoPlotas(f));
            } else if (pasirinkimas == 0) {
                System.out.println("Darbas baigiamas");
                break;
            } else {
                System.out.println("Neteisingas pasirinkimas");
            }
        }

    }

    public static int trikampioPlotas(int a, int b) {
        return (a * b) / 2;
    }

    public static int staciakampioPlotas(int c, int d) {
        return c * d;
    }

    public static int kvadratoPlotas(int e) {
        return e * e;
    }

    public static double apskritimoPlotas(double f) {

        return 3.14 * (Math.pow(f, 2));
    }
}
