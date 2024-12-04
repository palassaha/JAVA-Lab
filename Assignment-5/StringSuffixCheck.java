// Write a Java program to input two Strings and check whether the second String is the suffix of the first or vice-versa.

import java.util.Scanner;

public class StringSuffixCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // Check if the second string is a suffix of the first
        boolean isSecondSuffixOfFirst = firstString.endsWith(secondString);

        // Check if the first string is a suffix of the second
        boolean isFirstSuffixOfSecond = secondString.endsWith(firstString);

        // Display the results
        if (isSecondSuffixOfFirst) {
            System.out.println("The second string is a suffix of the first string.");
        } else if (isFirstSuffixOfSecond) {
            System.out.println("The first string is a suffix of the second string.");
        } else {
            System.out.println("Neither string is a suffix of the other.");
        }

        scanner.close();
    }
}
