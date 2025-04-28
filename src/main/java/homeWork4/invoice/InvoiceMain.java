package homeWork4.invoice;

public class InvoiceMain {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Model X", "Smart Blender", 2, 129.99);

        System.out.println("Model: " + invoice.getModel());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Total amount: $" + invoice.getAmount());
    }
}
