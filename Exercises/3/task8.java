import java.awt.Canvas;

public class task8 {
    static int count = 0;

    static void f(int x, int y, int r, Canvas c) {
        count++;
        if (r > 15) {
            f(x + r, y, r / 2, c);
            f(x - r, y, r / 2, c);
            f(x, y - r, r / 2, c);
            f(x, y + r, r / 2, c);
        }
    }

    public static void main(String[] args) {
        count = 0;
        f(500, 500, 100, null);
        System.out.println(count);
    }
}