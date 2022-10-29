package task2;

public class Collaborator extends Citizen {

    private String typeOfWork;

    public Collaborator(String firstName, String lastName, int age, String citizenship, String typeOfWork) {
        super(firstName, lastName, age, citizenship);
        this.typeOfWork = typeOfWork;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" Type of Work: " + typeOfWork);
    }
}
