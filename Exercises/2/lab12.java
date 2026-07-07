import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class lab12 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        
        // Fill the map with some data
        map.put("Apple", "Fruit");
        map.put("Banana", "Fruit");
        map.put("Cherry", "Fruit");
        map.put("Date", "Fruit");
        map.put("Elderberry", "Fruit");
        map.put("Fig", "Fruit");
        map.put("Grape", "Fruit");
        map.put("Raspberry", "Fruit");
        map.put("Strawberry", "Fruit");
        
        // Create submap with keys from "D" (inclusive) to "R" (exclusive)
        SortedMap<String, String> subMap = map.subMap("D", true, "R", false);
        
        System.out.println("SubMap contents:");
        for (Map.Entry<String, String> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}