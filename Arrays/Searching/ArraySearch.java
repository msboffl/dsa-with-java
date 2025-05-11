package Arrays.Searching;

import java.util.Arrays;

public class ArraySearch {
    // Linear Search In Array
    public static int linearSearch(int[] arr, int x) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search In Array
    public static int binarySearch(int[] arr, int x) {
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int x1 = 4;

        System.out.println("Linear Search Results");
        int result1 = linearSearch(arr1, x1);

        System.out.println(result1);

        int[] arr2 = {10, 8, 30, 4, 5};
        int x2 = 5;

        int result2 = linearSearch(arr2, x2);
        System.out.println(result2);

        int[] arr3 = {10, 8, 3};
        int x3 = 6;

        int result3 = linearSearch(arr3, x3);
        System.out.println(result3);

        System.out.println("Binary Search Results");
        int result4 = binarySearch(arr1, x1);
        System.out.println(result4);

    }
}
