import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kiek = 5;
        int[] mas = new int[kiek];
        int suma = 0;

        for (int i = 0; i < kiek; i++) {
            System.out.println("Iveskite skaiciu");
            mas[i] = sc.nextInt();
            suma += mas[i];
        }

        System.out.println(suma);
        System.out.println(Arrays.toString(mas));

    }
}
