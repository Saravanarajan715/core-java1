package library.books;


class Book {
    // Fields with default access (no modifier)
    String title;
    String author;
    String ISBN;

    // Constructor with default access
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Method with default access
    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}