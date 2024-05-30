package Array;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements separated by space:");
        String inputLine = sc.nextLine();
        String[] numbersAsString = inputLine.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        System.out.println("Value of largest element from the array is " + findLargest(numbers));
        sc.close();
    }

    private static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

}
