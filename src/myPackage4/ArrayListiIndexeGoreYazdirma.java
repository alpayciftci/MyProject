package myPackage4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListiIndexeGoreYazdirma {
    /*55-----
    Bir ArrayList oluşturun ve önce ArrayListi yazdıralım
    sonra index numarasına göre tek tek yazdıralım.

    ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

    Beklenen Çıktı:

    Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
    siyah
    mavi
    kirmizi
    yesil
    mor
    turuncu
    */

    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>();

        renkler.add("siyah");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("yesil");
        renkler.add("mor");
        renkler.add("turuncu");


        System.out.println(renkler);

        for (String s : renkler) {
            System.out.println(s);
        }
    }
}
