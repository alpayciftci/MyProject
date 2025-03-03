package myPackage4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListdeAralaraElemanEkleme {

/*52-----
    Array list oluşturun daha sonra aşağıda belirtilen yerlere
    yeni array elemanlarını ekleyen java kodunu yazınız.

    Array List:  siyah,mavi,kirmizi,beyaz

    en başa: pembe
    mavi-kirmizi arasına yesil  renk eklenecek.

    Beklenen Çıktı:
    [pembe,siyah,mavi,yesil,kirmizi,beyaz]
    */

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(Arrays.asList("siyah", "mavi", "kirmizi", "beyaz"));
        strList.addFirst("pembe");
        strList.add( strList.indexOf("mavi")+1, "yesil");
        System.out.println(strList);
    }
}
