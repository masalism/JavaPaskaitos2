package Listai;

import java.util.HashMap;
import java.util.Map;

public class MapPvz {
    public static void main(String[] args) {
        Map<Integer, String> mapExample = new HashMap<>();

        mapExample.put(12, "Mantas");
        mapExample.put(1, "Jonas");
        mapExample.put(13, "Petras");
        mapExample.put(15, "Jonas");
        mapExample.put(18, "Gabija");
        mapExample.put(12, "Jonas_pakartojam");

        for (Integer m : mapExample.keySet()) {
            System.out.println("Key: " + m+ " value " + mapExample.get(m));
        }
    }
}
