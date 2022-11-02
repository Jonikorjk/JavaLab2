package task3.interfaceandclases;

public class Solver {
    public double getMin(double start, double end, double step, Min cl) {
        double min = cl.f(start);
        for (double i = start; i <= end; i+= step) {
            if (cl.f(i) < min)
                min = cl.f(i);
        }

        return min;
    }
}
