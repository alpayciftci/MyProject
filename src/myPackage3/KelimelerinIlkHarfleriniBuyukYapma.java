package myPackage3;

import java.util.Arrays;
import java.util.Scanner;

public class KelimelerinIlkHarfleriniBuyukYapma {

    /*41-----
    Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

    Örnek
    makeTitle("Bu bir başlıktır")
    Bu Bir Başlıktır

    makeTitle("tüm ilk harfler büyük olacak")
    Tüm İlk Harfler Büyük Olacak
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Metin Giriniz");
        String str = scan.nextLine();
        String title = makeTitle (str);
        System.out.println(title);
    }
    public static String makeTitle(String str) {

        String[] sentence = str.split(" ");
        StringBuilder title = new StringBuilder();
        for (String each : sentence) {
            if (!each.isEmpty()) {
                title.append(Character.toUpperCase(each.charAt(0)));
                title.append(each.substring(1));
                title.append(" ");
            }
        }
        return title.toString().trim();
    }
}
