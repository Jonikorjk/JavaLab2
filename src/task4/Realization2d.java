package task4;

import java.awt.*;
import java.util.Arrays;

public class Realization2d extends AbstractArrayOfPoints {
    private int maxCountOfPoints = 300;
    private int indexOfLastPoint = -1;
    private double[][] points = new double[maxCountOfPoints][0];


    public Realization2d() {}
    @Override
    public void setPoint(int i, double x, double y) {
        if (!isRightIndex(i) || i >= count()) {
            System.out.println("Error, point with i = " + i + " does not exist");
            return;
        }
        points[i][0] = x;
        points[i][1] = y;
    }

    @Override
    public double getX(int i)   {
        if (!isRightIndex(i)) return Double.MIN_VALUE;
        return points[i][0];
    }

    @Override
    public double getY(int i)   {
        if (!isRightIndex(i)) return Double.MIN_VALUE;
        return points[i][1];
    }

    @Override
    public int count() {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i].length == 0 || points[i] == null) {
                break;
            }
            else count++;
        }
        return count;
    }

    @Override
    public void addPoint(double x, double y) {
        if (count() == maxCountOfPoints) {
            maxCountOfPoints *= 2;
            double[][] copy = new double[maxCountOfPoints][];
            for (int i = 0; i < points.length; i++) {
                copy[i] = Arrays.copyOf(points[i], points[i].length);
            }
            points = copy;
        }
        indexOfLastPoint++;
        points[indexOfLastPoint] = newPoint(x,y);
    }

    @Override
    public void removeLast() {
        points[indexOfLastPoint] = new double[0];
        indexOfLastPoint--;
    }

    private boolean isRightIndex(int index) {
        if (index < 0) {
            System.out.println("Error!, i must be >= 0");
            return false;
        }
        return true;
    }

    private double[] newPoint(double x, double y) {
        double[] point = new double[2];
        point[0] = x; point[1] = y;
        return point;
    }
}
