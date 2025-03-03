package myPackage1;

import java.util.Scanner;

public class SesliHarfSayanCode {
    public static void main(String[] args) {

        /*----
    Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

    Test Data:
    java is fun
    Beklenen Çıktı:
    Stringdeki sesli harf sayısı: 4
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str = scanner.nextLine();
        int sesliharf = SesliHarfSayisi(str);
        System.out.println("Metindeki sesli harf sayısı: " + sesliharf);

    }

    private static int SesliHarfSayisi(String str) {
        int toplam = 0;
        for (int i = 0; i < str.length(); i++ ) {
            char chr = str.toLowerCase().charAt(i);
                if(chr=='a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
                    toplam++;
                }
            }
        return toplam;

    }
}
