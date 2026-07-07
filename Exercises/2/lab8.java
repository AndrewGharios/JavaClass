import java.util.ArrayList;
import java.util.List;

class Canvas {
    static class Circle {
        int x, y, r;
        Circle(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }
    
    List<Circle> circles = new ArrayList<>();
    
    void drawCircle(int x, int y, int r, Canvas c) {
        circles.add(new Circle(x, y, r));
    }
}

public class lab8 {
    static void f(int x, int y, int r, Canvas c) {
        c.drawCircle(x, y, r, c);
        if (r > 15) {
            f(x + r, y, r / 2, c);
            f(x - r, y, r / 2, c);
            f(x, y - r, r / 2, c);
            f(x, y + r, r / 2, c);
        }
    }
    
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        f(500, 500, 100, canvas);
        
        Canvas.Circle last = canvas.circles.get(canvas.circles.size() - 1);
        System.out.println("Last circle: " + last.x + " " + last.y + " " + last.r);
    }
}