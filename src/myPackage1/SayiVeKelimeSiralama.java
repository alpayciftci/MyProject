package myPackage1;

import java.util.Arrays;

public class SayiVeKelimeSiralama {
    /*----
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.


    Test Data:
    [1232,1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]

    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
    */
    public static void main(String[] args) {

        int[] in = {1232,1134,2345,1022};
        String[] str = {"Java", "Python", "PHP", "C#", "C Programming", "C++" };
        // Sort the arrays
        Arrays.sort(str);
        Arrays.sort(in);
        // Print the sorted arrays
        System.out.println( Arrays.toString(in) );
        System.out.println( Arrays.toString(str) );

        // Alternative Method without using Arrays.sort() Method
        // Bubble Sort algorithm

        int[] in1 = {4657,1134,2345,5092};
        for (int i = 0; i < in1.length-1; i++ ){
            for (int j = 0; j < in1.length-1-i; j++){
                if (in1[j] > in1[j + 1]){
                    int temp = in1[j];
                    in1[j] = in1[j + 1];
                    in1[j + 1] = temp;
                }
            }
        }
        System.out.println( Arrays.toString(in1) );

    }
}
