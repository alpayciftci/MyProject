package myPackage2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayiArrayListeCevirmek {
    public static void main(String[] args) {

        /*-----
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : { "Python", "JAVA", "PHP", "Perl", "C#", "C++" }

    Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]
    */

        String[] arr = { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };
        // Converting the array to a deep string representation
        String arrayString = Arrays.toString(arr);
        // Printing the array string
        System.out.println(arrayString);

        // 2nd Method

        List<String> list = new ArrayList<> (Arrays.asList(arr));

        System.out.println("Beklenen Cikti: \n" + list);
    }
}
