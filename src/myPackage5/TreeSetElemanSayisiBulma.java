package myPackage5;

import java.util.TreeSet;

public class TreeSetElemanSayisiBulma {

     /*66-----
    Bir TreeSet oluşturalım ve Tree Listesini ve
    listedeki eleman sayısını yazdıran java kodunu yazdıralım.

    TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe

    Beklenen Çıktı:

    Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
    Tree eleman sayısı: 5
    */

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("yesil");
        treeSet.add("sari");
        treeSet.add("mavi");
        treeSet.add("kirmizi");
        treeSet.add("pembe");

        System.out.println("Original Tree Elements: " + treeSet);
        System.out.println("Number of Elements: " + treeSet.size());
    }
}
