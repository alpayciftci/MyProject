package myPackage3;

public class AlfabedeArdardaGelmeyenHarfiBulma {
    /*43----
    Girilen kelimedeki alfabeye göre ard arda gelmeyen harfleri bulunuz. (İngilizce alfabeye göre).
    Eğer herhangi atlanan bir harf yoksa "Sıralı Harfler" yazdıralım.
    Örnekler

    kayipHarfler("abdefg")
    Çıktı : c
    kayipHarfler("mnopqs")
    Çıktı : r
    kayipHarfler("abcdefgh")
    Çıktı : Sıralı Harfler

    ilk örnekte :  /// b harfinden sonra c gelmemiş
    ikinci örnekte : /// p harfinden sonra r gelmemiş
    */
    public static void main(String[] args) {
        kayipHarfler("mnqrstuv");
    }

    public static void kayipHarfler(String str){
        boolean sirali = true;
        for (int i = 0; i < str.length()-1; i++) {
           if(str.charAt(i+1)-str.charAt(i) != 1){
               for (int j = str.charAt(i) + 1; j < str.charAt(i + 1); j++) {
                   System.out.print((char) j + " ");
               }

               sirali = false;
           }
        }
        if (sirali) System.out.println("Sirali Harfler");
    }
}
