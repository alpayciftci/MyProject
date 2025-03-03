package myPackage4;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListiIteratorleTerstenYazdirma {

     /*59-----
    Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

    LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

    Beklenen Çıktı:
    Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
    LinkedList Tersi:
    mor
    beyaz
    kirmizi
    yesil
    mavi
    sari
    */

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        // Elemanları ekleyelim
        list.add("sari");
        list.add("mavi");
        list.add("yesil");
        list.add("kirmizi");
        list.add("beyaz");
        list.add("mor");

        System.out.println(list); // [sari, mavi, yesil, kirmizi, beyaz, mor]

        ListIterator<String> itr = list.listIterator(list.size());

        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
