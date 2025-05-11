package Arrays;

public class Traversal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Iterate from First to Last
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Next Line printing

        // Iterate from Last to First
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
