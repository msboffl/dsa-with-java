package Arrays.Subarrays;

import java.util.ArrayList;

public class GenerateSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            ArrayList<Integer> subArray = new ArrayList<>();
            for(int j = i; j < arr.length; j++) {
                subArray.add(arr[j]);
                ans.add(new ArrayList<>(subArray));
            }
        }

        System.out.println(ans);
    }
}
