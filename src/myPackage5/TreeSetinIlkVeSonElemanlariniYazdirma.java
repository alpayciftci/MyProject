package myPackage5;

import java.util.TreeSet;

public class TreeSetinIlkVeSonElemanlariniYazdirma {
     /*65-----
    Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

    TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe

    Beklenen Çıktı:
    Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
    ilk eleman: kirmizi
    son eleman: yesil
    */
     public static void main(String[] args) {

         TreeSet<String> treeSet = new TreeSet<>();

         treeSet.add("sari");
         treeSet.add("mavi");
         treeSet.add("yesil");
         treeSet.add("kirmizi");
         treeSet.add("turuncu");
         treeSet.add("pembe");

         System.out.println("Original Tree Elements: " + treeSet);
         System.out.println("First element: " + treeSet.first());
         System.out.println("Last Element: " + treeSet.last());
     }
}
