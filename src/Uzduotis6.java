import java.util.Arrays;

public class Uzduotis6 {
    public static void main(String[] args) {
        String[] mas = {"1", "2", "3", "4"};
        String[] mas2 = {"A", "B", "C", "D"};

        System.out.println(Arrays.toString(sumaisytas(mas, mas2)));


    }

    public static String[] sumaisytas (String mas[], String mas2[]){
        String[] galutinis = new String[4];
        for (int i = 0; i <mas.length; i++){
            String naujas = mas[i] + mas2[i];
            galutinis[i] = naujas;
        }
        return galutinis;
    }
}
