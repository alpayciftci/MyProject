package myPackage4;
import java.util.LinkedList;

public class LinkedListdeElemanlariTekTekYazdirma {
    /*56-----
    Bir linkedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

    LinkedList elemanları: sari,mavi,mor,yesil,beyaz

    Beklenen Çıktı:
    sari
    mavi
    mor
    yesil
    beyaz
    */
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();

            // Elemanları ekleyelim
            list.add("sari");
            list.add("mavi");
            list.add("mor");
            list.add("yesil");
            list.add("beyaz");

            // Tüm elemanları yazdıralım
            for (String element : list) {
                System.out.println(element);
            }
        }
}