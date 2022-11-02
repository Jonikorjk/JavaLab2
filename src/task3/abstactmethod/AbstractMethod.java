package task3.abstactmethod;

public abstract class AbstractMethod {

    abstract double f(double x);

    public double getMin(double start, double end, double step) {
        double min = f(start);
        for (double i = start; i <= end; i+= step) {
            if (f(i) < min)
                min = f(i);
        }

        return min;
    }
}
