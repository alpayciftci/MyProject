package myPackage3;

public class KelimelerinilkHarfiniBuyukYapma2 {
/*42----
    İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
    küçük yapan bir method yazınız.

    Örnekler
    getKelime("kal", "em") ? "Kalem"
    getWord("gözl", "emlemek") ? "Gözlemlemek"
    getWord("zor", "luk") ? "Zorluk"
    */
    public static void main (String[] args){
        System.out.println(getword("kal", "em"));
        System.out.println(getword("GOZLEM", "LEMEK"));
    }
    public static String getword (String word1, String word2){
        String words = "";
        words += KelimelerinIlkHarfleriniBuyukYapma.makeTitle(word1.toLowerCase());
        words += word2.toLowerCase();
        return words;
    }
}
