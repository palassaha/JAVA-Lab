// Write a Java program to check whether a String contains characters or digits or both.

import java.util.Scanner;

public class StringCharacterDigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        boolean hasLetters = false;
        boolean hasDigits = false;

        // Check each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                hasLetters = true;
            }
            if (Character.isDigit(ch)) {
                hasDigits = true;
            }
        }

        // Determine and display the result
        if (hasLetters && hasDigits) {
            System.out.println("The string contains both letters and digits.");
        } else if (hasLetters) {
            System.out.println("The string contains only letters.");
        } else if (hasDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains neither letters nor digits.");
        }

        scanner.close();
    }
}
