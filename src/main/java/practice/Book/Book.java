package practice.Book;

public class Book {
    String title;
    String author;
    double price;
    int pages;
    double discount;

    public Book(String title, String author, double price, int pages, double discount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.discount = discount;
    }
    public double calculateDiscount() {
        return price - (price * discount / 100);
    }
    public String bookInformation() {
        return ("Title: " + title + "\n" + "Author: " + author + "\n" + "Price: " + "$" + price + "\n" + "Pages: " + pages);
    }
}
