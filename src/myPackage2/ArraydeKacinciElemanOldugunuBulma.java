package myPackage2;

import java.util.Arrays;

public class ArraydeKacinciElemanOldugunuBulma {
    public static void main(String[] args) {

        /*----
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

    Array: [12,15,43,23,56,76,78,90,77,43]

    Aranan değer:56

    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı
    */

        int[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int aranan = 56;
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == aranan) {
                System.out.println(aranan + " sayisi arrayin " + i + ". elemani");
                sayac++;
                break;
            }
        }
            if (sayac == 0){
                    System.out.println(aranan + " sayısı arrayde bulunamadı.");
                }

        // Another Method
        int index = Arrays.stream(arr).boxed() .toList() .indexOf(aranan);
        if (index >= 0) {
            System.out.println(aranan + " sayısı arrayin " + index + ". elemanı");
        } else {
            System.out.println(aranan + " sayısı arrayde bulunamadı.");
        }
    }
}
