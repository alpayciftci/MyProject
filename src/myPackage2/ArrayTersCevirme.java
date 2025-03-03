package myPackage2;

import java.util.Arrays;

public class ArrayTersCevirme {

    /*-----
    Bir arrayi tersine çeviren  method yazınız.

    Test Data:

    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]
    */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println( reverse( arr ));
        System.out.println( reverse1( arr ));

    }
    public static String reverse (int[] arr){

        int[] reversedArr = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++) {

            reversedArr[i] = arr[arr.length-1-i];

        }

       return Arrays.toString(reversedArr);
    }

    // 2nd Method
    public static String reverse1(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        } return Arrays.toString(arr);
    }
}
