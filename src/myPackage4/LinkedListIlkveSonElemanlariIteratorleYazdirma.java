package myPackage4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIlkveSonElemanlariIteratorleYazdirma {

     /*58-----
    Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

    LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

    Beklenen Çıktı:

    Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
    Listenin ilk elemani: sari
    listenin son elemani: beyaz
    */

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        // Elemanları ekleyelim
        list.add("sari");
        list.add("mavi");
        list.add("turuncu");
        list.add("siyah");
        list.add("yesil");
        list.add("beyaz");

        System.out.println(list);

        ListIterator<String> listitr = list.listIterator();

        System.out.println("Listenin ilk Elemani: " + listitr.next());
        while (listitr.hasNext()) {
            listitr.next();
        }
        System.out.println("Listenin Son Elemani: " + listitr.previous());
    }
}
