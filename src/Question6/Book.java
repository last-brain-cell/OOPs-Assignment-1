package Question6;

import java.util.Scanner;

public class Book {
    private final float price;

    public Book(int bookNo, String title, float price) {
        this.price = price;

        System.out.println("Book Created!");
    }

    private void totalCost(int n){
        System.out.printf("Price of " + n + " copies: " + n*price);
    }

    void purchase() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number of Copies to be purchased");
        int copies = scn.nextInt();
        totalCost(copies);
    }
}
