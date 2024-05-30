package Array;

import java.util.Scanner;

public class KadanesAlgorithm {
    private static int findMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(currSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements separated by space:");
        String inputLine = sc.nextLine();
        String[] numbersAStrings = inputLine.split(" ");
        int[] arr = new int[numbersAStrings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbersAStrings[i]);
        }
        System.out.println("Value of maxmium subarray sum is " + findMaxSum(arr));
        sc.close();

    }

}
