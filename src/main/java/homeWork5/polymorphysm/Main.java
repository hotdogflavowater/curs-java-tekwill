package homeWork5.polymorphysm;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
       /* Square square = new Square();
        Circle circle = new Circle();*/
        Polygon polygon = new Polygon();
        Polygon circle = new Circle();
        Polygon square = new Square();

        polygon.render();
        circle.render();
        square.render();

    }
}
