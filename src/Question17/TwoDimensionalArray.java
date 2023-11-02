package Question17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TwoDimensionalArray {
    int[][] arr;
    private final Operations ops = new Operations();

    TwoDimensionalArray(int m, int n) {
        Scanner scn = new Scanner(System.in);
        arr = new int[m][n];
        for(int i=0; i < m; i++) {
            for(int j=0; j < n; j++) {
                System.out.print("\nEnter Element: ");
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("2-D Array Created!");
    }

    void display(){
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    void search(int query) {
        int result;
        for(int i = 0; i < arr.length; i++) {
            result = ops.binarySearch(arr[i], query);
            System.out.println("arr[" + i + "] -> " + result);
        }
    }

    void sort() {
        for(int i = 0; i < arr.length; i++) {
            ops.bubbleSort(arr[i]);
        }
        display();
    }
}
