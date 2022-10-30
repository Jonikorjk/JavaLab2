package task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("first realization");
        Realization2d realization2d = new Realization2d();
        realization2d.test();

        System.out.println("----------------------------------------");
        System.out.println("second realization");
        Realization1d realization1d = new Realization1d();
        realization1d.test();
    }
}
