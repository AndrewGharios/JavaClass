import java.util.HashSet;
import java.util.Scanner;

public class lab21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        
        while (true) {
            String line = sc.nextLine();
            if (line.equals("#")) break;
            String[] parts = line.split(" ");
            String op = parts[0];
            String word = parts[1];
            
            if (op.equals("+")) {
                set.add(word);
            } else if (op.equals("?")) {
                System.out.println(set.contains(word) ? "YES" : "NO");
            }
        }
        sc.close();
    }
}