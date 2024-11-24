// Write a Java program to calculate Fibonacci Series up to nth term (using Scanner)

import java.util.Scanner;

public class FibonacciSeries {
    public void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        FibonacciSeries fibonacci = new FibonacciSeries();
        fibonacci.printFibonacci(n);

        scanner.close();
    }
}
