package myPackage1;

import java.util.Scanner;

public class StrPalindrome {
    public static void main(String[] args) {

        /*----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str1 = scanner.nextLine();
        char[] charArray = new char[str1.length()];
        int j = 0;

           for (int i = str1.length()-1; i >=0 ; i--) {
               charArray[j] = str1.charAt(i);
            j++;
        }
        String str2 = new String(charArray);
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
