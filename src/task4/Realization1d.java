package task4;

import java.util.Arrays;

public class Realization1d extends AbstractArrayOfPoints {
    private int elements = 0;
    private double[] points = new double[elements];


    public Realization1d(int x, int y) {
        elements = 2;
        points = new double[elements];
        points[0] = x;
        points[1] = y;
    }

    public Realization1d() { }

    @Override
    public void setPoint(int i, double x, double y) {
        if (i < 0 || i >= count()) {
            System.out.println("Error!, point with i = " + i + " does not exist");
            return;
        }
        points[2 * i] = x;
        points[2 * i + 1] = y;
    }

    @Override
    public double getX(int i) {
        if (i < 0) {
            System.out.println("Error!, i must be >= 0");
            return  Double.MIN_VALUE;
        }
        return points[i * 2];
    }

    @Override
    public double getY(int i) {
        if (i < 0) {
            System.out.println("Error!, i must be >= 0");
            return  Double.MIN_VALUE;
        }
        return points[i * 2 + 1];
    }

    @Override
    public int count() {
        return points.length / 2;
    }

    @Override
    public void addPoint(double x, double y) {
        double[] copy = new double[points.length + 2];
        System.arraycopy(points, 0, copy, 0, points.length);
        copy[points.length] = x;
        copy[points.length + 1] = y;
        points = copy;
        elements =+ 2;
    }

    @Override
    public void removeLast() {
        if (count() == 0) {
            return;
        }
        double[] copy = Arrays.copyOf(points, points.length - 2);
        points = copy;
        elements -= 2;
    }
}
