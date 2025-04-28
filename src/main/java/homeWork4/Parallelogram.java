package homeWork4;

public class Parallelogram {

    public int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    public int calculatePerimeter(int sideLength) {
        return 4 * sideLength;
    }

    public double calculateArea(int length, double width) {
        return length * width;
    }

    public int calculateArea(int sideLength) {
        return sideLength * sideLength;
    }

    public static void main(String[] args) {
        Parallelogram p = new Parallelogram();

        System.out.println("Perimeter (length=10, width=5): " + p.calculatePerimeter(10, 5));
        System.out.println("Perimeter (square side=7): " + p.calculatePerimeter(7));
        System.out.println("Area (length=8, width=4.5): " + p.calculateArea(8, 4.5));
        System.out.println("Area (square side=6): " + p.calculateArea(6));
    }
}
