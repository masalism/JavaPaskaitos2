import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kiek = 5;
        String[] mas = new String[kiek];

        for (int i = 0; i < kiek; i++) {
            System.out.println("Iveskite zodi");
            mas[i] = sc.nextLine();
        }

        System.out.println(mas[0] + " " + mas[1] + " " + mas[2] + " " + mas[3] + " " + mas[4] + " ");

    }
}
