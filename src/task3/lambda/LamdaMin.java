package task3.lambda;

import task3.interfaceandanonuimclasses.AnoniumClassesMin;

public interface LamdaMin {

    double f(double x);

    static double getMin(double start, double end, double step, LamdaMin cl) {
        double min = cl.f(start);
        for (double i = start; i <= end; i+= step) {
            if (cl.f(i) < min)
                min = cl.f(i);
        }

        return min;
    }
}
