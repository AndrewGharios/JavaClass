import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        double left = -1000, right = 1000;
        double fl = f(left, a, b, c, d);
        double fr = f(right, a, b, c, d);
        
        if (fl > fr) {
            double temp = left;
            left = right;
            right = temp;
        }
        
        while (right - left > 1e-7) {
            double mid = (left + right) / 2;
            if (f(mid, a, b, c, d) < 0) {
                left = mid;
            } else {
                right = mid;
            }
        }
        System.out.printf("%.4f\n", left);
        sc.close();
    }
    
    static double f(double x, int a, int b, int c, int d) {
        return a * x * x * x + b * x * x + c * x + d;
    }
}