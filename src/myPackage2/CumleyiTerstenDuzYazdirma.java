package myPackage2;

import java.util.Arrays;
import java.util.Scanner;

public class CumleyiTerstenDuzYazdirma {
    public static void main(String[] args) {
         /*----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Cumle Giriniz..");

        String sentence = scanner.nextLine();

    // Replace multiple whitespaces with a single space
        String cleanedSentence = sentence.replaceAll("\\s+", " ");
        String[] words = cleanedSentence.split(" ");

        System.out.println(Arrays.toString(words));

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length-1; i >=0 ; i--) {
            reversed.append(words[i]).append(" ");

        }
        System.out.println(reversed.toString().trim());
    }
}
