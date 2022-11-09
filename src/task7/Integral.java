package task7;

public class Integral implements Integrable {
    @Override
    public double func(double x) {
        return Math.pow(x, 3);
    }

    @Override
    public double integral(double start, double end, double eps) {
        double area = 0;
        for (; start <= end; start += eps){
            if (func(start) > 0 && func(start + eps) > 0) {
                area += Math.abs((func(start)/2 + func(start + eps)/2) * eps);
            }
        }
        return area;
    }
}

