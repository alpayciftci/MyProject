package KarakterBulma;

import java.util.Arrays;
import java.util.Scanner;

public class KarakterSayisiBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Sentence");
        String sentence = scanner.nextLine();

        int[] charCounts = new int[383];
         //System.out.println(Arrays.toString(charCounts));

        // Convert the sentence to a character array
        char[] charArr = sentence.toCharArray();
        System.out.println("charArr:" + Arrays.toString(charArr));

        for (char ch : charArr) {
            // Increment the count for the character
            charCounts[ch]++;
        }

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0 ) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }
}
