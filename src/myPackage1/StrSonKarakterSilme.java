package myPackage1;

import java.util.Scanner;

public class StrSonKarakterSilme {

    public static void main(String[] args) {

        /*----
    Kullanıcıdan alınan Stringin son karakterini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good
    Beklenen Çıktı:
    goo
    */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz...");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length()-1; i++) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        // Diger Method
        System.out.println(str.substring(0, str.length() - 1));

    }
}
