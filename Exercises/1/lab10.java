import java.util.Scanner;

public class lab10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] wires = new int[n];
        int maxWire = 0;
        for (int i = 0; i < n; i++) {
            wires[i] = sc.nextInt();
            if (wires[i] > maxWire) {
                maxWire = wires[i];
            }
        }
        
        int left = 1, right = maxWire;
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canCut(wires, k, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
    
    static boolean canCut(int[] wires, int k, int length) {
        long total = 0;
        for (int w : wires) {
            total += w / length;
        }
        return total >= k;
    }
}