package task2;

public class Human {
    protected String firstName;
    protected String lastName;
    protected int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void printInfo() {
        System.out.print("FirstName: " + firstName + " LastName: " + lastName + " Age: " + age);
    }
}
