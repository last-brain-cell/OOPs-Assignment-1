package Question18;

public class Main {
    public static void main(String[] args) {
        DynamicArrays arr = new DynamicArrays();

        for(int i=0; i<=10; i++) {
            arr.insertElement(i, i);
        }

        arr.displayArray();

        arr.deleteElement(6);

        arr.displayArray();
    }
}
