package homeWork6.employee;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 1);
        Programmer programmer = new Programmer("Bob", 2);

        manager.attendTraining();
        manager.conductInterview();

        programmer.attendTraining();
    }
}
