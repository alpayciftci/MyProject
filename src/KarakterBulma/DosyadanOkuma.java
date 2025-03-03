package KarakterBulma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DosyadanOkuma {
    public static void main(String[] args) {
        try {
            // Create a File object to represent the file
            File file = new File("sentence.txt");

            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(file);

            // Read the entire contents of the file into a StringBuilder
            StringBuilder sentenceBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                sentenceBuilder.append(scanner.nextLine()).append(" ");
            }
            scanner.close();

            // Convert the StringBuilder to a single string
            String sentence = sentenceBuilder.toString().trim();
            System.out.println("File content: " + sentence);

            // Increase array size to cover most Unicode characters
            int[] charCounts = new int[10000];

            // Convert the sentence to a character array
            char[] charArr = sentence.toCharArray();
            // System.out.println("charArr: " + Arrays.toString(charArr));

            // Count each character
            for (char c : charArr) {
                charCounts[c]++;
            }
            // Print the character counts
            for (int i = 0; i < charCounts.length; i++) {
                if (charCounts[i] > 0) {
                    System.out.println((char) i + ": " + charCounts[i]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}