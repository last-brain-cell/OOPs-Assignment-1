package Question4;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Sides");

        double x = scn.nextDouble();
        double y = scn.nextDouble();
        double z = scn.nextDouble();

        if(x + y + z == 180) {
            if(x == y && y == z) {
                System.out.println("Equilateral Triangle!");
            } else if (x == y || y == z || x == z) {
                System.out.println("Isosceles Triangle!");
            } else {
                System.out.println("Scalene Triangle!");
            }
        } else {
            System.out.println("Not a Triangle!");
        }
    }
}
