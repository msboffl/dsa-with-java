package Arrays.Deletion;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteAtEnd {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0};

        // 1. Built-in Method
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        // arr1.removeLast();
        arr1.remove(arr1.size()-1);
        System.out.println("Using Built-In: " + arr1);

        // 2. Custom Method
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        n--;
        System.out.println("Using Custom Method: " + Arrays.toString(arr));
    }
}
