import java.util.Scanner;

public class lab9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] stalls = new int[n];
        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }
        
        int left = 1, right = stalls[n - 1] - stalls[0];
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canPlace(stalls, k, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
    
    static boolean canPlace(int[] stalls, int k, int dist) {
        int count = 1;
        int last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= dist) {
                count++;
                last = stalls[i];
            }
        }
        return count >= k;
    }
}