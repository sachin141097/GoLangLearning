package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeElementsOptimised {
    private static String rearrangeArrayElements(int[] arr) {
        int n = arr.length;
        int positiveIndex = 0, negativeIndex = 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[positiveIndex] = arr[i];
                positiveIndex += 2;
            } else {
                ans[negativeIndex] = arr[i];
                negativeIndex += 2;
            }
        }
        return Arrays.toString(ans);
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
        System.out.println("Value of array after rearranging the elements is " + rearrangeArrayElements(arr));
        sc.close();
    }
}