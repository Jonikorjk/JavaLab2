package task3.interfaceandanonuimclasses;

public interface AnoniumClassesMin {
    double f(double x);
    static double getMin(double start, double end, double step, AnoniumClassesMin cl) {
        double min = cl.f(start);
        for (double i = start; i <= end; i+= step) {
            if (cl.f(i) < min)
                min = cl.f(i);
        }

        return min;
    }
}
