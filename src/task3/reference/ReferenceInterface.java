package task3.reference;



public interface ReferenceInterface {
    double f(double x);

    static double getMin(double start, double end, double step, ReferenceInterface cl) {
        double min = cl.f(start);
        for (double i = start; i <= end; i+= step) {
            if (cl.f(i) < min)
                min = cl.f(i);
        }

        return min;
    }
}
