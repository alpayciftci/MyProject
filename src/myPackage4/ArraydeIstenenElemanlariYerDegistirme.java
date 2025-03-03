package myPackage4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydeIstenenElemanlariYerDegistirme {
    /*54-----
    Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

    Array Elemanları: sari,yesil,mavi,pembe

    mavi rengini turuncu ile değiştirelim.

    Beklenen Çıktı:
    [sari,yesil,mavi,pembe]
    [sari,yesil,turuncu,pembe]
    */

    public static void main(String[] args) {
        List<String> renkler = new ArrayList<>(Arrays.asList("sari", "yesil", "mavi", "pembe"));
        // "mavi" rengini "turuncu" ile değiştiriyoruz
        int index = renkler.indexOf("mavi");
        if (index != -1) {
            renkler.set(index, "turuncu");
        }
        System.out.println(renkler);
    }
}
