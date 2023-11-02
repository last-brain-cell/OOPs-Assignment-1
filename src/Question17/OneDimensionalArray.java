package Question17;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class OneDimensionalArray {
    int[] arr;
    private final Operations ops = new Operations();

    OneDimensionalArray(int n) {
        arr = new int[n];
        for(int i=0; i < n; i++) {
            Scanner scn = new Scanner(System.in);
            arr[i] = scn.nextInt();
        }
        System.out.println("1-D Array Created!");
    }

    void display(){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void search(int query) {
        System.out.println("\n" + ops.binarySearch(arr, query));
    }

    void sort() {
        ops.bubbleSort(arr);
        display();
    }
}
