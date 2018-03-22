package IdomiosUzduotys;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotis5i {
    public static void main(String[] args) {
        System.out.println("Iveskite kiek sudeginote kuro ir nuvaziuota atstuma km:");
        Scanner sc = new Scanner(System.in);
        double sanaudos = getCorrectNumber(sc);
        double kelias = getCorrectNumber(sc);
        System.out.println("Sanaudos 100 km: " + sanaudos100km(sanaudos, kelias));
    }

    public static double sanaudos100km(double sanaudos, double kelias) {
        return (sanaudos * 100) / kelias;
    }
    private static double getCorrectNumber (Scanner sc){
        double result = 0.0;
        while (true){
            try {
                result = sc.nextDouble();
                break;
            } catch (InputMismatchException e){
                System.out.println("blogas skaicius, bandykite dar karta");
                sc.nextLine();
            }
        }
        return  result;
    }
}
