package KarakterBulma;

import java.util.Arrays;
import java.util.Scanner;

public class KarakterSayisiBulmaTr {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz..");
        String cumle = scanner.nextLine();

        int[] karakterSayisi = new int[383];
        System.out.println(Arrays.toString(karakterSayisi)); // karakterSayisi arrayini gormek icin yazdirdim

        // Cumleyi karakter Listesine Cevir
        char[] charArr = cumle.toCharArray();
        System.out.println("charArr:" + Arrays.toString(charArr));

        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            karakterSayisi[c]++;
        }

/*  For each Loop ile

        for (char c : charArr) {
            karakterSayisi[c]++;
        }
 */
        // System.out.println(Arrays.toString(karakterSayisi)); // karakterSayisi Arrayinin son hali

        for (int i = 0; i < karakterSayisi.length; i++) {
            if (karakterSayisi[i] > 0 ) {                   // degeri 0 dan buyuk olanlari yazdiriyoruz
                System.out.println((char) i + ": " + karakterSayisi[i]);
            }
        }
    }
}
