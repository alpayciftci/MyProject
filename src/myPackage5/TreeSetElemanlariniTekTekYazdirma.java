package myPackage5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetElemanlariniTekTekYazdirma {

     /*63-----
    Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

    TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

    Beklenen Çıktı:
    beyaz
    kirmizi
    mavi
    sari
    siyah
    yesil
    */

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("yesil");
        treeSet.add("mavi");
        treeSet.add("kirmizi");
        treeSet.add("sari");
        treeSet.add("beyaz");
        treeSet.add("siyah");

        System.out.println("TreeSet elements:");
        for (String element : treeSet){
            System.out.println(element);
        }
    }
}
