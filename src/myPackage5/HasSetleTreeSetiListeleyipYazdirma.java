package myPackage5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasSetleTreeSetiListeleyipYazdirma {
    /*61-----
    HashSet ile list oluşturalım ve  TreeSet ile sıralayalım
    ve listeyi yazdıralım.


    HashSet List: sari,mavi,kirmizi,yesil,mor

    Beklenen Çıktı:
    TreeSet elements:
    kirmizi
    mavi
    mor
    sari
    yesil
    */
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Sari");
        hashSet.add("Mavi");
        hashSet.add("Kirmizi");
        hashSet.add("Yesil");
        hashSet.add("Mor");

        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet elements:");
        for (String element : treeSet){
            System.out.println(element);
        }
    }
}


