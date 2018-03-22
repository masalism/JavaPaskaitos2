import java.util.Scanner;


//Kiek zodyje yra raidziu
public class Uzduotisk1 {
    public static void main(String[] args) {
        System.out.println("Iveskite zodi");
        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        System.out.println("Jusu zodyje yra raidziu: " + zodis.length());
    }
}
