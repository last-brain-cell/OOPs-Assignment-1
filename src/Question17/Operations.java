package Question17;

public class Operations {
    int binarySearch(int[] arr, int query) {
        bubbleSort(arr);
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi) {
            int mid = Math.floorDiv((lo + hi), 2);
            if(arr[mid] == query) {
                return mid;
            } else if (arr[mid] > query) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    void bubbleSort(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
