package myPackage2;

import java.util.ArrayList;
import java.util.List;

public class Array4HarfliKelimeReturn {
     /*---
    String array dizisindeki 4 harfli kelimeleri return eden methodu yazınız.


    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])

     ["Pair"]
    */
     public static void main(String[] args) {
         String[] arr = {"Tomato", "Potato", "Pair","Elma","Kivi"};
         List<String> fourLetterWords = getFourLetterWords(arr);
         System.out.println(fourLetterWords);

     }

    public static List<String> getFourLetterWords(String[] arr) {
         List<String> result = new ArrayList<>();
         for (String word : arr) {
             if (word.length() == 4) {
                 result.add("\"" +word+"\"");
             }
         }
         return result;
     }
}
