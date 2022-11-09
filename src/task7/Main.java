package task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps;
        double start;
        double end;

        while(true) {
            System.out.print("Input start of the interval: ");
            start = sc.nextDouble();
            System.out.print("Input end of the interval: ");
            end = sc.nextDouble();
            System.out.print("Input eps: ");
            eps = sc.nextDouble();

            if (start > end) {
                System.out.println("\nThe lower bound of the integral cannot be greater than its upper bound!\n");
                continue;
            }
            else break;
        }
        double rectangle = new Integrable() {
            @Override
            public double func(double x) {
                return Math.pow(x, 3);
            }
        }.integral(start, end, eps);

        System.out.println("\nRectangle method: " + rectangle);

        double trapezoid = new Integral().integral(start, end, eps);
        System.out.println("Trapezoid method: " + trapezoid);

        System.out.println("Difference = " + (rectangle - trapezoid));
    }
}
