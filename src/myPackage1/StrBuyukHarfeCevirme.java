package myPackage1;

import java.util.Scanner;

public class StrBuyukHarfeCevirme {
    public static void main(String[] args) {
    /*----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str = scanner.nextLine().toUpperCase();
        System.out.println(str);
    }
}
