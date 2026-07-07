import java.util.HashMap;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            System.out.print(count.getOrDefault(x, 0) + (i < m - 1 ? " " : ""));
        }
        sc.close();
    }
}