package task2;

public class Citizen extends Human {
    protected String citizenship;

    Citizen(String firstName, String lastName, int age, String citizenship) {
        super(firstName, lastName, age);
        this.citizenship = citizenship;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" Citizenship: " + citizenship);
    }
}
