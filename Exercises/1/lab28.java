import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class lab28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, HashSet<String>> perms = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String filename = parts[0];
            HashSet<String> rights = new HashSet<>();
            for (int j = 1; j < parts.length; j++) {
                rights.add(parts[j]);
            }
            perms.put(filename, rights);
        }
        
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String[] parts = sc.nextLine().split(" ");
            String op = parts[0];
            String filename = parts[1];
            String right = "";
            if (op.equals("read")) right = "R";
            else if (op.equals("write")) right = "W";
            else if (op.equals("execute")) right = "X";
            
            if (perms.containsKey(filename) && perms.get(filename).contains(right)) {
                System.out.println("OK");
            } else {
                System.out.println("Access denied");
            }
        }
        sc.close();
    }
}