package coding;

import java.io.*;
import java.util.Map;
import java.util.Set;

public class ReadCodeService {
    private static final String CODE_FILE_NAME = "files/koduote.txt"; //konstanta kur sedi failas .txt

    public void readFileAndPutToMaps(Map<Integer, String> codeMap, Map<String, Integer> valuesMap) throws JACodeExeption {
        //Nuskaitymas failo
        try (BufferedReader bf = new BufferedReader(new FileReader(CODE_FILE_NAME))) { //try with resources, kai jis pabaigia darba jis bet kuriuo atveju ji uzdaro
            String line;
            while ((line = bf.readLine()) != null) {
                String[] items = line.split(" ");
                if (items.length != 2) {
                    throw new JACodeExeption("Koduote yra bloga");
                }
                codeMap.put(Integer.valueOf(items[0]), items[1]);
                valuesMap.put(items[1], Integer.valueOf(items[0]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeDataIntoFile(Set<Integer> items) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("files/uzkoduota.txt"))) {
            for (Integer item : items) {
                bw.write(item);
            }
        } catch (IOException e) {

        }
    }
}
