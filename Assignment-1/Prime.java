// Write a Java Program to print all prime numbers within a given range.

import java.util.Scanner;

public class Prime {
    public void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) { // Prime numbers have exactly two divisors (1 and itself)
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        Prime primeFinder = new Prime();
        primeFinder.printPrimesInRange(start, end);

        scanner.close();
    }
}
