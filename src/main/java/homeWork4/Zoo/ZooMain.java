package homeWork4.Zoo;

public class ZooMain {
    public static void main(String[] args) {
        Animal myElephant = new Elephant();

        myElephant.eat();
        myElephant.sleep();
        myElephant.breathe();
        Animal.displayMaxAge();

        Herbivore herbivore = new Elephant();
        herbivore.findFood();
        herbivore.Graze();
    }
}
