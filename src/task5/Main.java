package task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);

        Circle[] circles = {
                new Circle(12.4),
                new Circle(1),
                new Circle(-3),
                new Circle(-100),
                new Circle(3.1)
        };

        Arrays.sort(circles);

        for (var i : circles) {
            System.out.println(i.toString());
        }

    }
}
