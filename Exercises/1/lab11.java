import java.util.ArrayList;
import java.util.Scanner;

public class lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> balls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            balls.add(sc.nextInt());
        }
        
        int removed = 0;
        while (true) {
            int[] range = findRange(balls);
            if (range == null) {
                break;
            }
            int l = range[0], r = range[1];
            removed += r - l;
            for (int i = r - 1; i >= l; i--) {
                balls.remove(i);
            }
        }
        System.out.println(removed);
        sc.close();
    }
    
    static int[] findRange(ArrayList<Integer> balls) {
        int i = 0;
        while (i < balls.size()) {
            int j = i;
            while (j < balls.size() && balls.get(j).equals(balls.get(i))) {
                j++;
            }
            if (j - i >= 3) {
                return new int[]{i, j};
            }
            i = j;
        }
        return null;
    }
}