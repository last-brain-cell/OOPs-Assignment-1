package Question6;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bookNo = scn.nextInt();
        String title = scn.next();
        float price = scn.nextFloat();

        Book book = new Book(bookNo, title, price);

        book.purchase();
    }
}
