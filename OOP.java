public class Main {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);
            Circle c2 = (Circle) c1.clone();

            System.out.println(c1);
            System.out.println(c2);

            c1.setRadius(6);
            System.out.println(c1);
            System.out.println(c2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
