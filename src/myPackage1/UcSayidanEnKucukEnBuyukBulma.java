package myPackage1;

import java.util.Scanner;

public class UcSayidanEnKucukEnBuyukBulma {
    public static void main(String[] args) {
/*---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        int sayi1 = 12;
        int sayi2 = 24;
        int sayi3 = 34;
        int enKucukSayi = findMin(sayi1, sayi2, sayi3);
        System.out.println("En küçük sayı: " + enKucukSayi);

        // ternary ile
        System.out.println(sayi1<sayi2 ? (Math.min(sayi1, sayi3)):(Math.min(sayi2, sayi3)));
    }
    public static int findMin(int sayi1, int sayi2, int sayi3) {
        if (sayi1 < sayi2 && sayi1 < sayi3) {
            return sayi1;
        }
        else if (sayi2 < sayi1 && sayi2 < sayi3) {
            return sayi2;
        }
        else {
            return sayi3;
        }

    }
}
