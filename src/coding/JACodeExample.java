package coding;

import java.util.*;

public class JACodeExample {
    public static void main(String[] args) {
        Map<Integer, String> codeMap = new HashMap<>();
        Map<String, Integer> valueMap = new HashMap<>();
        Set<Integer> items = new LinkedHashSet<>();

        ReadCodeService readCodeService = new ReadCodeService();
        try {
            readCodeService.readFileAndPutToMaps(codeMap, valueMap);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Iveskite teksta kodavimui");
            String line = scanner.nextLine();

            for (int i = 0; i < line.length(); i++) {
                String temp = String.valueOf(line.charAt(i));
                String letter = temp.equals(" ") ? "tarpas" : temp; //pakeitem reiksme
                System.out.print(valueMap.get(letter) + " ");
                items.add(valueMap.get(letter));
            }

        } catch (JACodeExeption e) {
            System.out.println("Programa negali buti ivygdyta, nes koduote pazeista");
        }

        readCodeService.writeDataIntoFile(items);
    }
}
