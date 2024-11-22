// Write a Java program to find the minimum in an array of integers.

import java.util.Scanner;

public class FindMinimum {
    public int findMin(int[] array) {
        int min = array[0]; // Assume the first element is the minimum
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        FindMinimum findMinimum = new FindMinimum();
        int minValue = findMinimum.findMin(array);

        System.out.println("The minimum value in the array is: " + minValue);

        scanner.close();
    }
}
