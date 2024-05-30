package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of integers separated by space:");
        String inputLine = sc.nextLine();
        String[] numbersAsString = inputLine.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Total number of subarray whose sum is " + k + " are: " + findSubArrays(numbers, k));
        sc.close();
    }

    private static int findSubArrays(int[] numbers, int k) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);
        for (int num : numbers) {
            prefixSum += num;
            count += prefixSumCount.getOrDefault(prefixSum - k, 0);
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

}
