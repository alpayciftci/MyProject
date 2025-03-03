package myPackage4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayElemanlariniTekTekYazma {

/*51-----
    Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

    Array elemanları:  siyah,sari,mavi,turuncu

    Beklenen Çıktı:
    siyah
    sari
    mavi
    turuncu
    */

    public static void main(String[] args) {

        List<String> str = new ArrayList<> (Arrays.asList("siyah", "sari", "mavi", "turuncu"));

        System.out.println(str);

        for (String s : str) {
            System.out.println(s);
        }
    }
}
