package myPackage5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetiTreeSeteCeviripYazdirma {
     /*62-----
    Bir HashSet oluşturalım ve
    HashSet elemanlarını TreeSet e dönüştürelim.
    Tree Set elemanlarını tektek yazdıralım.

    HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi

    Beklenen Çıktı:
    Tree Set Elemanlari:
    kirmizi
    mavi
    sari
    turuncu
    yesil
    */

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Sari");
        hashSet.add("Mavi");
        hashSet.add("Yesil");
        hashSet.add("Turuncu");
        hashSet.add("Kirmizi");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet elements:");
        for (String element : treeSet){
            System.out.println(element);
        }
    }
}
