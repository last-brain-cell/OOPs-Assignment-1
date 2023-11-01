package Question15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
    }
}


//In Java, you can use the Scanner class to read user input

//In this program, we first import the java.util.Scanner class, then create a Scanner object named scanner.
// We use the nextLine() method of the Scanner object to read a line of text from the user. The entered text
// is then stored in the userInput variable and printed to the console.


//Handling Input and Output in Java ->
//Java provides several ways to handle input and output which are:

//1. Standard Streams: All programming languages provide support for standard I/O where the user’s program can take input from a keyboard and then produce an output on the computer screen. If you are aware of C or C++, then you must be aware of three standard devices STDIN, STDOUT and STDERR. Similarly, Java provides 3 standard streams − System.in, System.out, and System.err.
//
//2. File I/O: Java provides strong but flexible support for I/O related to files and networks but this tutorial covers very basic functionality related to streams and I/O.
//
//3. Network I/O: Java’s capabilities for networked I/O is built into the java.net package, which is not covered in this tutorial.
//

