// Write a Java program to implement Linear search.

import java.util.Scanner;

public class LinearSearch {
    public int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
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

        System.out.print("Enter the key to search: ");
        int key = scanner.nextInt();

        LinearSearch ls = new LinearSearch();
        int result = ls.search(array, key);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found.");
        }

        scanner.close();
    }
}
