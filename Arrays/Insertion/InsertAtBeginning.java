package Arrays.Insertion;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertAtBeginning {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0};
        int element = 50;

        // 1. Built-in Method
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        arr1.add(0, element);
        System.out.println("Using Built-In: " + arr1);

        // 2. Custom Method
        int n = 4;
        for(int i = n-1; i >=0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = element;
        System.out.println("Using Custom Method: " + Arrays.toString(arr));
    }
}
