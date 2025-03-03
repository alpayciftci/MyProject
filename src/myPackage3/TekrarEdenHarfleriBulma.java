package myPackage3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekrarEdenHarfleriBulma {
    /*44----
    String içindeki birden fazla geçen karakter sayısını bulan program yazınız.
     Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettiği için
     bu String için sonuç 1 olacak.
     Eğer herhangi tekrar eden bir harf yoksa 0 sayısını döndersin program.

    Örnekler:
    duplicates("Hello World!")
    Çıktı : 2
    duplicates("foobar")
    Çıktı : 1
    duplicates("helicopter")
    Çıktı : 1
    */
    public static void main(String[] args) {
       duplicates("foobar");

        String str = "Hello World!";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            String character = str.substring(i, i + 1);
            if (str.indexOf(character) != str.lastIndexOf(character) && !list.contains(character)) {
                list.add(character);
            }
        }

        System.out.println(list);
        System.out.println(list.size());

    }
    public static void duplicates(String str){
        int duplicateCount = 0;
        int[] charCounts = new int[256];
        // Convert the sentence to a character array
        char[] charArr = str.toCharArray();
        // System.out.println("charArr:" + Arrays.toString(charArr));

        for (char ch : charArr) {
            // Increment the count for the character
            charCounts[ch]++;
        }
        // Count how many characters have duplicates
        for (int charCount : charCounts) {
            if (charCount > 1) {
                duplicateCount++;
            }
        }
        System.out.println("Number of duplicate characters: " + duplicateCount);
    }
}
