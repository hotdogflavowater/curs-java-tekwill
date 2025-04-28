package homeWork4.Zoo;

public interface Animal {
     int MAX_AGE = 100;

     void eat();
     void sleep();

     default void breathe() {
         System.out.println("breathe");
     }

     static void displayMaxAge() {
         System.out.println("Max age: " + MAX_AGE);
    }

}
