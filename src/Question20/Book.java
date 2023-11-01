package Question20;

public class Book {
    private int bookId;
    private final int pages;
    private final String title;
    private final String author;
    private boolean checkedOut;

    Book(int bookId, String title, String author, int pages) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.pages = pages;
        checkedOut = false;
    }

    void checkout(){
        checkedOut = true;
    }

    void returnBook(){
        checkedOut = false;
    }

    void getBook() {
        System.out.println("------------------------------------------------");
        System.out.println("Book " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Number of Pages: " + pages);
        System.out.println("Book checked out: " + checkedOut);
        System.out.println("------------------------------------------------");
    }

    void changeBookId(int id) {
        bookId = id;
        System.out.println("Book id changed...");
    }

    int getBookId() {
        return bookId;
    }
}
