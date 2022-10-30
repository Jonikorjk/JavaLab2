package task6;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Triangle[] triangles = {
                new Triangle(1,2,3),
                new Triangle(6,3,2),
                new Triangle(3, 4, 5),
                new Triangle(10, 15, 7),
                new Triangle(-3, 7.13, 5)
        };
//        Arrays.sort(triangles, new CompareByArea());



        // without additional clases (using anon class)
        Arrays.sort(triangles, new Comparator<Triangle>() {
            @Override
            public int compare(Triangle o1, Triangle o2) {
                return Double.compare(o1.getArea(), o2.getArea());
            }
        });

        for (var i : triangles) {
            System.out.println(i.toString());
        }

    }
}
