package Question1;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Consumer ID: ");
        String consumerId = scn.nextLine();
        System.out.println("Enter Consumer Name: ");
        String consumerName = scn.nextLine();
        System.out.println("Enter previous Reading: ");
        int previousReading = Integer.parseInt(scn.nextLine());
        System.out.println("Enter current Reading: ");
        int currentReading = Integer.parseInt(scn.nextLine());
        System.out.println("Enter Type of EB Connection (domestic/commercial): ");
        String type = scn.nextLine();

        switch (type) {
            case "domestic":
                System.out.println("Electricity Bill: " + calculateDomestic(currentReading));
                break;
            case "commercial":
                System.out.println("Electricity Bill: " + calculateCommercial(currentReading));

            default:
                System.out.println("Something went wrong!");
                break;
        }

    }

    static double calculateDomestic(int units){
        if(units <= 100) {
            return units;
        } else {
            return 0;
        }
    }

    static double calculateCommercial(int units){
        if(units <= 100) {
            return units*2;
        } else {
            return 0;
        }
    }
}
