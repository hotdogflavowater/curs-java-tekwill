package homeWork4.Zoo;

public class Elephant extends Herbivore implements Animal {
    public void eat() {
        System.out.println("Elephant is eating");
    }

    public void sleep() {
        System.out.println("Elephant is sleeping");
    }

    @Override
    public void findFood() {
        System.out.println("Elephant finds food");
    }
}
