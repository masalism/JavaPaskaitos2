import java.util.Scanner;

public class uzduotis2 {
    private static final int MAX_NUMB = 100;
    public static void main(String[] args) {
        //Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek skaičių,
        // kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.
        System.out.println("Kiek skaiciu norite ivesti");
        Scanner sc = new Scanner(System.in);

        int kiek = sc.nextInt();

        int [] skaiciai = new int[kiek];

        for (int i = 0; i < kiek; i++) {
            System.out.println("Iveskite skaiciu" + i + " skaicius");
            skaiciai[i] = sc.nextInt();

        }

        printMas(skaiciai);
    }

    private static void printMas(int[] skMas){
        for (Integer sk : skMas){
            if (sk > MAX_NUMB){
                System.out.println(sk);
            }
        }
    }
}
