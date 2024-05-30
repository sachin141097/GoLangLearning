package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeElements {
    private static String rearrangeArrayElements(int[] arr) {
        int n = arr.length;
        int[] positive = new int[n / 2];
        int[] negative = new int[n / 2];
        int positiveIndex = 0, negativeIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive[positiveIndex] = arr[i];
                positiveIndex++;
            } else {
                negative[negativeIndex] = arr[i];
                negativeIndex++;
            }
        }
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = positive[i];
            arr[2 * i + 1] = negative[i];
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements separated by space: ");
        String inputLine = sc.nextLine();
        String numbersAsString[] = inputLine.split(" ");
        int[] arr = new int[numbersAsString.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbersAsString[i]);
        }
        System.out.println("Value of array after rearranging the elements is " + rearrangeArrayElements(arr));
        sc.close();

    }

}
