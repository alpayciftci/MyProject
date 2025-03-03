package myPackage1;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı girin:");
        int sayi = scanner.nextInt();

        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10; // son rakamı ekler
            sayi /= 10; // son rakamı çıkartır
            System.out.println(sayi);
        }

        System.out.println("Girilen sayının rakamlarının toplamı: " + toplam);
    }
}
