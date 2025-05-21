package Arrays.Subarrays;

public class TwoEqualSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};

        // Brute Force
        /* int leftSum = 0;
        for(int i = 0; i < arr.length; i++) {
            int rightSum = 0;
            for(int j = i+1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            leftSum += arr[i];

            if (leftSum == rightSum) {
                System.out.println(leftSum);
                System.out.println(rightSum);
            }
        }

        if (leftSum == 0) {
            System.out.println("Not Found Equal Subarrays");
        }*/

        // Two Loops
        int leftSum = 0;
        for(int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
        }

        int rightSum = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            rightSum += arr[i];
            leftSum -= arr[i];

            if(leftSum == rightSum) {
                System.out.println(leftSum);
                System.out.println(rightSum);
            }
        }



    }
}
