import java.util.*;

public class lab27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> sales = new TreeMap<>();
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) continue;
            String[] parts = line.split(" ");
            if (parts.length < 3) break;
            String customer = parts[0];
            String product = parts[1];
            int qty = Integer.parseInt(parts[2]);
            
            sales.putIfAbsent(customer, new TreeMap<>());
            TreeMap<String, Integer> products = sales.get(customer);
            products.put(product, products.getOrDefault(product, 0) + qty);
        }
        
        for (Map.Entry<String, TreeMap<String, Integer>> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, Integer> prod : entry.getValue().entrySet()) {
                System.out.println(prod.getKey() + " " + prod.getValue());
            }
        }
        sc.close();
    }
}