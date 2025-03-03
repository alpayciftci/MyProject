package myPackage2;

import java.util.Arrays;

public class ArrayOfMultiples {

    /*----
    Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.

    Test Data:
    arrayOfMultiples(7, 5)

    sonuç: [7,14,21,28,35]
    */
    public static void main(String[] args) {
       int x = 7;
       int y = 5;
        arrayOlustur(x, y);
    }
    public static void arrayOlustur(int x, int y) {
        int[] arr = new int[y];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = x * (i+1);
        }
        System.out.println(Arrays.toString(arr));
    }
}
