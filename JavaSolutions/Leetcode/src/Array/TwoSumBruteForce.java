package Array;

import java.util.Scanner;

public class TwoSumBruteForce {
    private static int[] findTwoSumTarget(int[] arr, int targetSum) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] + arr[j] == targetSum) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements separated by space: ");
        String inputLine = sc.nextLine();
        String[] numbersAsString = inputLine.split(" ");
        int[] arr = new int[numbersAsString.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbersAsString[i]);
        }
        System.out.println("Enter the value of target sum:");
        int targetSum = sc.nextInt();
        System.out.println("Indexes of element that sum upto target are: " + findTwoSumTarget(arr, targetSum));
        sc.close();

    }

}
