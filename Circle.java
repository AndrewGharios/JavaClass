import java.util.Objects;

public class Circle implements Comparable<Circle>, Cloneable {
    public static final double DEFAULT_RADIUS = 0.0;
    private Double radius;

    public Circle() {
        this(DEFAULT_RADIUS);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    @Override
    public String toString() {
        return "Circle: " + getRadius();
    }

    @Override
    public int compareTo(Circle other) {
        return radius.compareTo(other.radius);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}