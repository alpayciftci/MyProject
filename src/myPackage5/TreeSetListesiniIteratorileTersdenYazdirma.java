package myPackage5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetListesiniIteratorileTersdenYazdirma {
    /*64-----
    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım
    ve ardından  descendingIterator()  fonksiyonunu kullanarak
    ters sıradan yazdıralım.

    TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

    Beklenen Çıktı:
    Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]

    Tersten Siralanisi:

    yesil
    turuncu
    sari
    mavi
    kirmizi
    */
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("yesil");
        treeSet.add("sari");
        treeSet.add("mavi");
        treeSet.add("turuncu");
        treeSet.add("kirmizi");

        System.out.println("Original Tree Elements: " + treeSet);
        Iterator<String> descendingIterator = treeSet.descendingIterator();

        System.out.println("TreeSet reversed elements:");
        while (descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }
    }
}
