package practice;

@FunctionalInterface
 interface Greeter {
     void sayHello();
}

public class GreeterMain {
     public static void main(String[] args) {
        Greeter g = () -> System.out.println("Hello World");
        g.sayHello();
     }
}
