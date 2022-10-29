package task2;

public class Student extends Citizen {
    private int scolarship = 0;
    private String speciality;

    public Student(String firstName, String lastName, int age, String citizenship, String speciality) {
        super(firstName, lastName, age, citizenship);
        this.speciality = speciality;
    }
    public Student(String firstName, String lastName, int age, String citizenship, String speciality, int scolarship) {
        this(firstName, lastName, age, citizenship, speciality);
        if (scolarship < 0) return;
        this.scolarship = scolarship;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" Speciality: " + speciality + " Scolarship: " + scolarship);
    }
}
