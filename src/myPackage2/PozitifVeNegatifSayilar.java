package myPackage2;

import java.util.Arrays;

public class PozitifVeNegatifSayilar {
    /*39-----
    Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.

    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.

    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
    */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

        System.out.println(Arrays.toString(count(arr)));

    }

    public static int[] count(int[] arr) {
        int negativeSum = 0;
        int positiveCount = 0;

        for (int j : arr) {
            if (j > 0) {
                positiveCount++;
            } else if (j < 0) {
                negativeSum += j;
            }
        }
        if (arr.length == 0) return new int[]{};
        return new int[]{positiveCount, negativeSum};
    }
}
