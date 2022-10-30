package task6;

import java.util.Comparator;


//class CompareByArea implements Comparator<Triangle> {
//
//    @Override
//    public int compare(Triangle o1, Triangle o2) {
//        return Double.compare(o1.getArea(), o2.getArea());
//    }
//}

public class Triangle {
    double a, b, c;
    private boolean triangleIsExist = true;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a >= (b + c) || b >= (a + c) || c >= (a + b)) triangleIsExist = false;
        if (a <= 0 || b <= 0 || c <= 0) triangleIsExist = false;
    }

    public double getPerimeter() {
        if (!triangleIsExist) return -1;
        return a + b + c;
    }

    public double getArea() {
        if (!triangleIsExist) return -1;
        return 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
    }

    @Override
    public String toString() {
        if (!triangleIsExist) {
            return "Triangle with sides: a = " + a + " b = " + b + " c = " + c + " doesn't exist";
        }

        return "The first side: " + a + " The second side: " + b + " The third side: " + c + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }
}
