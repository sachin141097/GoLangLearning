package Array;

import java.util.Scanner;

public class TransposeMatrix {
    private static void displayMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the array elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                System.out.println("Element scanned to array");
            }
        }
        System.out.println("Value of original matrix");
        displayMatrix(arr);
        System.out.println("Value of matrix after transpose is");
        int[][] transpose = new int[cols][rows];
        // transpose the matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        displayMatrix(transpose);
        sc.close();

    }

}
