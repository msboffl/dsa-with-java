package Arrays.Insertion;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertAtAnyPosition {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0};
        int element = 50;

        // 1. Built-in Method
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        arr1.add(1, element);
        System.out.println("Using Built-In: " + arr1);

        // 2. Custom Method
        int n = 4, pos=2;
        for(int i = n; i >=pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos-1] = element;
        System.out.println("Using Custom Method: " + Arrays.toString(arr));
    }
}
