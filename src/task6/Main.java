package task6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Triangle[] triangles = {
                new Triangle(1,2,3),
                new Triangle(6,3,2),
                new Triangle(3, 4, 5),
                new Triangle(10, 15, 7),
                new Triangle(-3, 7.13, 5)
        };
        Arrays.sort(triangles, new CompareByArea());
        for (var i : triangles) {
            System.out.println(i.toString());
        }

    }
}
