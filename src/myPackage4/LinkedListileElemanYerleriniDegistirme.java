package myPackage4;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListileElemanYerleriniDegistirme {

    /*60-----
    Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı
    yer değiştiren java kodunu yazınız.

    LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

    hint:  Collections.swap();

    Beklene Çıktı:
    Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
    Swap sonrası durum: [siyah,kirmizi,beyaz,mavi,yesil,turuncu]
    */

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // Elemanları ekleyelim
        list.add("mavi");
        list.add("kirmizi");
        list.add("beyaz");
        list.add("siyah");
        list.add("yesil");
        list.add("turuncu");

        // Orijinal listeyi yazdır
        System.out.println("Orijinal liste: " + list);

        // swap() yöntemini kullanarak iki elemanın yerini değiştir
        Collections.swap(list, 0, 3); // "mavi" ve "siyah" elemanlarını değiştir

        // Güncellenmiş listeyi yazdır
        System.out.println("Güncellenmiş liste: " + list);
    }
}