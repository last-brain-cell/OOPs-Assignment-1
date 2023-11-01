package Question20;

import java.util.Scanner;

public class UI {
    private Scanner scn = new Scanner(System.in);
    private Library library = new Library();

    UI() {
        System.out.println("------------------------------------------------");
        System.out.println("\t\t\tLibrary Management System");
        System.out.println("------------------------------------------------");
        System.out.println("commands - \nAdd Book into Library: 1\nDisplay all the books in the library: 2\nCheckout a Book: 3\nReturn a book: 4\nStop Program: 0");
        System.out.println("------------------------------------------------");
    }

    void run() {
        boolean flag = true;
        while(flag) {
            System.out.print("Enter Command: ");
            int command = scn.nextInt();

            switch (command) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    library.insertBook();
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("\nEnter Book ID: ");
                    int id = scn.nextInt();
                    library.checkOutBook(id);
                    break;
                case 4:
                    System.out.print("\nEnter Book ID: ");
                    int bookId = scn.nextInt();
                    library.returnBook(bookId);
                    break;
                default:
                    System.out.println("Invalid Command!");
            }
        }
    }
}
