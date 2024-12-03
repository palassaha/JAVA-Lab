// Write a Java program to input a sentence and display the words in sorted order.

import java.util.Arrays;
import java.util.Scanner;

public class SortWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Words in sorted order:");
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}
