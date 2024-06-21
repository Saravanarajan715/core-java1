package library.books;


public class Library {
    public static void main(String[] args) {
        // Create a new Book instance
        Book book = new Book("1984", "George Orwell", "123456789");

        // Access default fields within the same package
        System.out.println("Book Title: " + book.title);
        System.out.println("Book Author: " + book.author);
        System.out.println("Book ISBN: " + book.ISBN);

        // Access default method within the same package
        book.displayBookInfo();
    }
}
