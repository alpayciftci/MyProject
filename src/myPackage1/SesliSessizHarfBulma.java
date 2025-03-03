package myPackage1;

import java.util.Scanner;

public class SesliSessizHarfBulma {
    public static void main(String[] args) {

    /*----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sessiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String str = scanner.nextLine();
        boolean sesliharf = false;
        char chr = str.charAt(0);
        char[] sesliharfler = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        if (str.length() == 1 && Character.isLetter(chr)) {
            for (int i = 0; i < 10; i++) {
                if (chr == sesliharfler[i]) {
                    System.out.println(chr + " harfi sesli harftir");
                    sesliharf = true;
                    break;
                }
            }
                if (!sesliharf) {
                    System.out.println(chr + " harfi sessiz harftir");
                }
        }
        else{
                System.out.println("Yanlis Karakter Girdiniz");
            }
    }
}