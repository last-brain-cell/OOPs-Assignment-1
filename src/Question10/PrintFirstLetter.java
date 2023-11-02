package Question10;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintFirstLetter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        StringTokenizer tkz = new StringTokenizer(str, " ");

        while(tkz.hasMoreTokens()) {
            System.out.print(tkz.nextToken().substring(0,1).toUpperCase() + " ");
        }
    }
}
