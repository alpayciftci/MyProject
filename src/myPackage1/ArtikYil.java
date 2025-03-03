package myPackage1;

import java.time.LocalDate;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        /*----
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol etmek için bir Java Methodu yazınız.

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz...");
        int yil = scanner.nextInt();
        Boolean artikyil = artikyilbul(yil);
        System.out.println(artikyil);

        //2. Yol
        LocalDate date = LocalDate.of(yil, 12, 11);
        System.out.println(date.isLeapYear());
        //
    }
    public static boolean artikyilbul(int yil) {
            return (yil % 400 == 0) || (yil % 100 != 0 && yil % 4 == 0);
    }
}
