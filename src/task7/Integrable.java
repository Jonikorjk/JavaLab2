package task7;

public interface Integrable {
    abstract double func(double x);

    default double integral(double start, double end, double eps) {
        double area = 0;
        for (; start <= end; start += eps) {
            if (func(start + eps) > 0) {
                area += Math.abs(eps * func(start + eps));
            }
        }
        return area;
    }
}
