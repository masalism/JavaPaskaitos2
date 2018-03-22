package IdomiosUzduotys;

public class Uzduotis2i {
    public static void main(String[] args) {

        String word = "Ana";

        arPalindromas(word);
    }
    private static boolean arPalindromas (String word) {
        String myWord = word.replaceAll("\\s+","");
        String reverse = new StringBuffer(myWord).reverse().toString();
        return reverse.equalsIgnoreCase(myWord);
    }
}
