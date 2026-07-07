import java.util.HashMap;
import java.util.Map;

public class task12 {
    public static void main(String[] args) {
        Map<String, Double> markBook = new HashMap<>();
        markBook.put("a", 3.0);
        markBook.put("b", 4.0);
        markBook.put("c", 5.0);

        double average = markBook.values().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(average);
    }
}