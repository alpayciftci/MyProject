package myPackage3;

public class StringdeOrtadakiHarfleriBulma {

    /*47----
    Ortadaki harfi alabileceğimiz bir program yazın.
    Eğer harf sayısı 2 nin katına eşitse,
    ortadaki 2 harfi alın, diğer durumda ortadaki 1 harfi alın.

    Examples

    ortadakiHarf("test")
    Çıktı : es
    ortadakiHarf("testing")
    Çıktı : t
    ortadakiHarf("middle")
    Çıktı : dd
    ortadakiHarf("A")
    Çıktı : A
    */
    public static void main(String[] args) {
        System.out.println(ortakiHarf("testing")); // t
        System.out.println(ortakiHarf("middle")); // dd
        System.out.println(ortakiHarf("A")); // A
        System.out.println(ortakiHarf("test")); // es
    }

    public static String ortakiHarf(String str) {
        int middleindex = str.length()/2;

        if (str.length() % 2 == 0) {
            // For even length strings, return the middle two characters
            str = str.substring(middleindex-1, middleindex+1);
        } else {
            // For odd length strings, return the middle character
            str = str.substring(middleindex, middleindex+1);
        }
        return str;
    }
}
