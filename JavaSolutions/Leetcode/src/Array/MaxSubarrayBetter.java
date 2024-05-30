package Array;

import java.util.Scanner;

public class MaxSubarrayBetter {
    private static int findMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements separated by space:");
        String inputLine = sc.nextLine();
        String[] numbersAsSrStrings = inputLine.split(" ");
        int[] arr = new int[numbersAsSrStrings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbersAsSrStrings[i]);
        }
        System.out.println("Value of maxmium subarray sum is " + findMaxSum(arr));
        sc.close();

    }

}
