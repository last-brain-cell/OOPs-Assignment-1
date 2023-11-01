package Question15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer:");
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("You've entered invalid input!");
        }
    }
}

//-> Exception Handling
//
//Java exception handling is managed via five keywords: try, catch, throw, throws, and finally. Briefly,
// here is how they work. Program statements that you think can raise exceptions are contained within a try block.
// If an exception occurs within the try block, it is thrown (using throw). Your code can catch this exception (using catch)
// and handle it in some rational manner. The finally keyword is used to create a block of code that follows a try block.
// A finally block of code always executes, whether or not an exception has occurred.

