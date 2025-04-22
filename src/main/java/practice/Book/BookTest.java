package practice.Book;

public class BookTest {
    public static void main(String[] args) {
        Book JavaProgramming = new Book("Java Programming", "John Doe", 50.0, 300, 10);
        Book PythonForBeginners = new Book("Python for Beginners", "Jane Smith", 40.0, 250, 10);

        double discount = JavaProgramming.calculateDiscount();
        double discount2 = PythonForBeginners.calculateDiscount();

        String information = JavaProgramming.bookInformation();
        String information2 = PythonForBeginners.bookInformation();

        System.out.println(JavaProgramming.bookInformation());
        System.out.println(PythonForBeginners.bookInformation());

        System.out.println("Price of " + "'Java Programming' after 10% discount: " + JavaProgramming.calculateDiscount());
        System.out.println("Price of " + "'Python for Beginners' after 10% discount: " + PythonForBeginners.calculateDiscount());


    }
}
