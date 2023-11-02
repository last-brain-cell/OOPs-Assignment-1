package Question18;

import java.util.ArrayList;
import java.util.ListIterator;

public class DynamicArrays {
    private ArrayList<Integer> dynamicArray = new ArrayList<Integer>();

    DynamicArrays() {
        System.out.println("Dynamic Array Created...");
    }

    void insertElement(int element, int index) {
        try{
            dynamicArray.add(index, element);
        } catch (Exception e) {
            System.out.println("Can't insert element at this index");
        }
    }

    void deleteElement(int index) {
        try {
            dynamicArray.remove(index);
        } catch(Exception e) {
            System.out.println("No element at that index.");
        }
    }

    void displayArray() {
        ListIterator<Integer> itr = dynamicArray.listIterator();
        while(itr.hasNext()) {
            System.out.println(" " + itr.next() + " ");
        }
    }
}
