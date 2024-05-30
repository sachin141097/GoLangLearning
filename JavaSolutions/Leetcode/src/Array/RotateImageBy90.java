package Array;

import java.util.Scanner;

public class RotateImageBy90 {
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

    private static int[][] rotateMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] rotatatedMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatatedMatrix[j][rows - 1 - i] = arr[i][j];
            }
        }
        return rotatatedMatrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Value of matrix before rotation is:");
        displayMatrix(matrix);
        System.out.println("Value of matrix after rotating it by 90 degree is:");
        int[][] rotatedMatrix = rotateMatrix(matrix);
        displayMatrix(rotatedMatrix);
        sc.close();
    }

}
