package myPackage2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydeIstenenDegeriBulma {
    public static void main(String[] args) {
        /*----
    Yazılan değerin array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]


    Aranan Değer:2020
    Beklenen Çıktı:True

    Aranan Değer:2010
    Beklenen Çıktı :False
    */
        List<Integer> a = new ArrayList<>();

        a.add(1551);
        a.add(1223);
        a.add(1443);
        a.add(1267);
        a.add(1789);
        a.add(1023);
        a.add(2020);

        System.out.println(a);
        System.out.println("Aranan Değer : " + a.contains(1551)); // Aranan Deger : true
        System.out.println("Aranan Değer : " + a.contains(2010)); // Aranan Deger : false

       // 2nd Method

        int[] array = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        int aranan = 2020;
        Arrays.sort(array); // Ensure the array is sorted
        int index = Arrays.binarySearch(array, aranan);

        if (index >= 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
