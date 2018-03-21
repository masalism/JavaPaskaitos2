import java.util.Scanner;

public class uzduotis1 {

    //Parašyti programą, kuri leistų vartotojui įvesti norimą skaičių ir po to parašytų
    // ar šis skaičius yra lyginis, ar nelyginis. Užuomina panaudokite % operatoriu.
    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 != 0){
            System.out.println(a + " Skaicius nelyginis");
        } else {
            System.out.println(a + " Skaicius lyginis");
        }

    }
}
