package Arrays.Subarrays;

public class TwoEqualSubArrays {
    public static void printTwoSubArrays(int[] arr) {
        int n = arr.length;
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += arr[i];

            int rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                System.out.println("First Subarray:");
                for (int k = 0; k <= i; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();

                System.out.println("Second Subarray:");
                for (int k = i + 1; k < n; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                return; // Exit after finding first such split
            }
        }

        System.out.println("No such two subarrays with equal sum.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        printTwoSubArrays(arr);
    }
}
