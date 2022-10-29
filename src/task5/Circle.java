package task5;

public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLengthOfCircle() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle a) {
        return Double.compare(radius, a.radius);
    }

    @Override
    public String toString() {
        if (radius <= 0) return "Circle with radius = " + radius + " does not exist :(" ;
        return "[Radius: " + radius + ", Area: " + getArea() + ", Length: " + getLengthOfCircle() + "]";
    }
}
