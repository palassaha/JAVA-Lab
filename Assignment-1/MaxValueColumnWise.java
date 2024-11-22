// Write a Java program to input integers in a two dimensional array and
// display the maximum value column wise.

import java.util.Scanner;

public class MaxValueColumnWise {
    public void findMaxColumnWise(int[][] array, int rows, int cols) {
        for (int col = 0; col < cols; col++) {
            int max = array[0][col];
            for (int row = 1; row < rows; row++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
            System.out.println("Maximum value in column " + col + ": " + max);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        MaxValueColumnWise maxValue = new MaxValueColumnWise();
        maxValue.findMaxColumnWise(array, rows, cols);

        scanner.close();
    }
}

