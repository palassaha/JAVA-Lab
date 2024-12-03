// Write a Java program to find the length of a String except white spaces.

import java.util.Scanner;

public class StringLengthWithoutSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String stringWithoutSpaces = input.replaceAll("\\s", "");

        int length = stringWithoutSpaces.length();

        System.out.println("The length of the string excluding white spaces is: " + length);

        scanner.close();
    }
}
