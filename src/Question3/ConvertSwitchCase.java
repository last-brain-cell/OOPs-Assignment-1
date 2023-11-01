package Question3;

import java.util.Scanner;

public class ConvertSwitchCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int var = scn.nextInt();

        switch (var){
            case 1:
                System.out.println("Good!");
                break;
            case 2:
                System.out.println("better!");
                break;
            case 3:
                System.out.println("Best!");
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
    }
}
