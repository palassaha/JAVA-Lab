// Write a Java program to compare two Strings and find if they are equal or not.

import java.util.Scanner;

public class StringEqualityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        // if (firstString.equals(secondString)) {
        //     System.out.println("The strings are equal.");
        // } else {
        //     System.out.println("The strings are not equal.");
        // }

        boolean flag = true;
        if (firstString.length() != secondString.length()) {
            flag = false;
        } else {
            for (int i=0; i < firstString.length(); i++) {
                if (firstString.charAt(i) != secondString.charAt(i)) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true) {
            System.out.println("The Strings are equal");
        } else {
            System.out.println("The Strings are not equal");
        } 

        scanner.close();
    }
}
