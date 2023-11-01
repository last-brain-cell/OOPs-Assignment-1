package Question20;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    void insertBook() {
        Scanner scn = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.print("Book ID: " );
        int bookId = scn.nextInt();
        scn.nextLine();
        System.out.print("Book Title: ");
        String title = scn.nextLine();
        System.out.print("Book Author: " );
        String author = scn.nextLine();
        System.out.print("Number of Pages: ");
        int pages = scn.nextInt();
        System.out.println("------------------------------------------------");
        Book book = new Book(bookId, title, author, pages);
        books.add(book);
        System.out.println("Book added!");
    }

    void displayBooks() {
        ListIterator<Book> list = books.listIterator();

        System.out.println("------------------------------------------------");
        System.out.println("\t\t\tAvailable Books: \n");

        while(list.hasNext()) {
            list.next().getBook();
        }

        System.out.println("------------------------------------------------");
    }

    void checkOutBook(int id) {
        ListIterator<Book> list = books.listIterator();

        while(list.hasNext()) {
            Book book = list.next();
            if (book.getBookId() == id) {
                book.checkout();
            }
        }
    }

    void returnBook(int id) {
        ListIterator<Book> list = books.listIterator();

        while(list.hasNext()) {
            Book book = list.next();
            if (book.getBookId() == id) {
                book.returnBook();
            }
        }
    }
}
