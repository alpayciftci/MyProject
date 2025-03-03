package myPackage3;

public class IkiStringten1cininSonharfineEsitmi {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen bir program yazınız.

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */
    public static void main(String[] args) {
        System.out.println(kontrolEt("samurai", "zi" )); //false
        System.out.println(kontrolEt("abc", "bc"));      // true
        System.out.println(kontrolEt("convention", "tio")); // false
        System.out.println(kontrolEt("feminine", "nine")); // true
    }
    public static boolean kontrolEt (String str1, String str2){

        return str1.endsWith(str2);

        //........... 2nd Method..............
        // return str1.substring(str1.length()-str2.length()).equals(str2);
    }
}
