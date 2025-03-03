package myPackage4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydeIstenenElemanlariYazdirma {
    /*53-----
    Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

    ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

    Beklenen Çıktı:

    Arrayin 1. elemani: beyaz
    Arrayin 3. elemani: sari
    */

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(Arrays.asList("beyaz", "siyah", "sari", "kirmizi", "turuncu"));
        System.out.println("Arrayin 1. elemani: " + strList.getFirst());
        System.out.println("Arrayin 3. elemani: " + strList.get(2));
    }
}
