package myPackage2;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        Arrays.sort(array); // Ensure the array is sorted

        int aranan = 56;
        int index = Arrays.binarySearch(array, aranan);

        if (index >= 0) {
            System.out.println(aranan + " sayısı arrayin " + index + ". elemanı");
        } else {
            System.out.println(aranan + " sayısı arrayde bulunamadı.");
        }
    }
}

