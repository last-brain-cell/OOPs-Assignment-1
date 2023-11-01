package Question2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Principal: ");
        double principal = scn.nextDouble();
        System.out.println("Enter Rate: ");
        double rate = scn.nextDouble();
        System.out.println("Enter Time: ");
        double time = scn.nextDouble();

        System.out.println("Simple Interest: " + (principal*rate*time)/100);
    }
}
