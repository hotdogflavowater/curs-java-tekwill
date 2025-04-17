package homework1;

public class TaxCalculator {
    public static void main(String[] args) {

        double price = 7.11;
        double tax = price * 0.05;
        int quantity = 1;
        double total = price * quantity * tax;

        String message = "I want to by " + quantity + " short!";

        System.out.println(message + "\n" + "Total cost with tax is: " + total);
    }
}
