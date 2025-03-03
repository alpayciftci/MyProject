package myPackage4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistiIteratorYardimiylaYazdirma {
    /*57-----
    Bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki
    elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

    LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

    1. elemandan itibaren yazdıralım.

    Beklenen Çıktı:
    beyaz
    mavi
    yesil
    turuncu
    */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // Elemanları ekleyelim
        list.add("sari");
        list.add("beyaz");
        list.add("mavi");
        list.add("yesil");
        list.add("turuncu");

        // Iterator kullanarak 1. elemandan itibaren yazdıralım
        Iterator<String> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
