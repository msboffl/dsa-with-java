package Arrays.Matrix;

import java.util.Arrays;

public class Representation {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int[][] arr = new int[rows][cols];

        int[] arr1 = new int[rows];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        System.out.println(Arrays.deepToString(arr));
        // System.out.println(Arrays.toString(arr1));
        int m = arr.length;
        int n = arr[1].length;
        System.out.println(m);
        System.out.println(n);
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
