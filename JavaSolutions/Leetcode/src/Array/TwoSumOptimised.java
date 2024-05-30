package Array;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class TwoSumOptimised {
    private static int[] findTwoSumTarget(int[] arr, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (m.containsKey(target - arr[i])) {
                return new int[] { i, m.get(target - arr[i]) };
            }
            m.put(arr[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements separated by space:");
        String inputLine = sc.nextLine();
        String[] numbersAsStrings = inputLine.split(" ");
        int[] nums = new int[numbersAsStrings.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numbersAsStrings[i]);
        }
        System.out.println("Enter the value of target:");
        int target = sc.nextInt();
        System.out.println("Indexes of element that sum upto target are: " + findTwoSumTarget(nums, target));
        sc.close();
    }

}
