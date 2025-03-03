package myPackage1;

import java.util.Scanner;

public class StrIstenilenKarakteriYazdirma {
    public static void main(String[] args) {
    /*----
    Girilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun
    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str = scanner.nextLine();
        System.out.println("Hangi siradaki karakteri yazalim");
        int i = scanner.nextInt();

        if (i >= 0 && i < str.length()) {
            System.out.println(i + ". pozisyondaki karakter : " + str.charAt(i));
        } else System.out.println("istenen sira yok");
    }
}
