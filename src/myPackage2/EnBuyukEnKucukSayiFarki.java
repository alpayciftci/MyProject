package myPackage2;

import java.util.Arrays;

public class EnBuyukEnKucukSayiFarki {
    /*38----
        Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.

        Örnek -
        farkBul([10, 15, 20, 2, 10, 6])
        18
        */
        public static void main(String[] args) {
            int[] arr = {10, 15, 20, 2, 10, 6};
            int difference = findDifference(arr);
            System.out.println("Difference: " + difference);
        }

        public static int findDifference(int[] arr) {
            Arrays.sort(arr); // Sort the array
            int min = arr[0]; // First element is the minimum
            int max = arr[arr.length - 1]; // Last element is the maximum
            return max - min; // Return the difference
        }

}
