import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double input, input2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a SINGLE number. This will be used for the circle radius, the square's side, and one side of the rectangle:\n");
        input = sc.nextDouble();
        Shape circle = new Circle(input);
        Shape square = new Square(input);
        System.out.print("Enter the other side of the triangle:\n");
        input2 = sc.nextDouble();
        Shape rect = new Rectangle(input, input2);
        System.out.println();

        circle.Area();
        square.Area();
        rect.Area();
        System.out.println();
        circle.Perimeter();
        square.Perimeter();
        rect.Perimeter();
        sc.close();
    }

}
