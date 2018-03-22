import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotis3 {
    public static void main(String[] args) {
        //Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0.
        // Pabaigoje turi būti atvaizduojama įvestų skaičių suma. Skaičiavimas turi būti atliekamas kitame metode.
        // Papildykite programą kuri neleistu įvesti ne skaičius, jei vartotojas įveda ne skaičių programa prašo
        // pakartoti tol kol bus įvestas skaičius.

        Scanner sc = new Scanner(System.in);
        int sk = 0;
        int kiek = 0; //indeksas i kuri masyvo elementa det
        int[] mas = {}; //tuscias masyvas

        do {
            System.out.println("Iveskite skaiciu, jei ivesti 0 programa baigs darba");
            try {
                sk = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius, programa baigia darba");
                sc.nextLine();
                //sk = 0;
            }
            //masyvo pailginimas
            if (mas.length <= kiek) {
                mas = Arrays.copyOf(mas, mas.length + 1);
            }
            mas[kiek++] = sk;
        } while (sk != 0);

        System.out.println("Suma yra: " + masSum(mas));
    }

    private static int masSum(int[] mas) {
        int sum = 0;
        for (Integer m : mas) {
            sum += m;
        }
        return sum;

    }
}
