package task2;



public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Igor", "Shevchenko", 21);
        Human human2 = new Human("Anton", "Krinitsa", 18);

        Citizen citizen1 = new Citizen("Kirill", "Korneev", 24, "ukrainian");
        Citizen citizen2 = new Citizen("Aleksandr", "Smith", 24, "englishman");

        Student student1 = new Student("Anotolii", "Parker", 17, "swede", "Engineer", 1700);
        Student student2 = new Student("Mikhail", "Simple", 19, "ukrainian", "Computer Engineer", -300);
        Student student3 = new Student("Aleksei", "Savchenko", 21, "ukrainian", "Economist");

        Collaborator collaborator1 = new Collaborator("John", "Smith", 33, "swede", "moral support");
        Collaborator collaborator2 = new Collaborator("Jack", "Parker", 47, "englishman", "tea support");



        Human[] peopeles = {human1, human2, citizen1, citizen2, student1, student2, student3, collaborator1, collaborator2};

        for (var i : peopeles) {
            i.printInfo();
            System.out.println();
        }

    }
}
