package KarakterBulma;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class sil {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding elements
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
                System.out.println(map);

        // Retrieving elements
        int appleQuantity = map.get("Apple");
        System.out.println("Apple Quantity: " + appleQuantity);

        // Iterating over elements
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
