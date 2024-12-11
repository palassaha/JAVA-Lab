// Write a Java program to input a sentence and display the words in sorted order.

// import java.util.Arrays;
import java.util.Scanner;

public class SortWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // String[] words = sentence.split("\\s+");
        // Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        // System.out.println("Words in sorted order:");
        // for (String word : words) {
        //     System.out.println(word);
        // }

        String[] words = new String[100];
        int count = 0;
        String current = "";
        for (int i=0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                current += ch;
            } else {
                if (!current.isEmpty()) {
                    words[count++] = current;
                    current = "";
                }
            }
        }
        if(!current.isEmpty()) {
            words[count++] = current;
        }
        for (int i=0; i < count -1; i++) {
            for (int j=0; j < count-1-i; j++) {
                if (words[j].compareToIgnoreCase(words[j+1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted words");
        for (int i=0; i<count; i++) {
            System.out.println(words[i]);
        }
        scanner.close();
    }
}
