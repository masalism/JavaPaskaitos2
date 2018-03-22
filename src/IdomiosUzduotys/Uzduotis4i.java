package IdomiosUzduotys;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotis4i {

    public static void main(String[] args) {
        System.out.println("Iveskite savo mase (kg) ir ugi (m)");
        Scanner sc = new Scanner(System.in);
        float mase = sc.nextFloat();
        float ugis = sc.nextFloat();
        System.out.println("Jusu kmi: " + KMI(mase, ugis));
    }

    public static float KMI(float mase, float ugis) {
        return mase / (ugis * ugis);
    }



}
