package Question17;

public class Main {
    public static void main(String[] args) {
        OneDimensionalArray arr = new OneDimensionalArray(5);

        arr.display();
        arr.sort();
        arr.search(3);

        TwoDimensionalArray arr2D = new TwoDimensionalArray(3, 4);

        arr2D.display();
        arr2D.sort();
        arr2D.search(2);
    }
}
