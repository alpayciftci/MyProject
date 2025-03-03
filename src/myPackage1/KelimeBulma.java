package myPackage1;

import java.util.Scanner;

public class KelimeBulma {
    public static void main(String[] args) {
        /*-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String str = scanner.nextLine();

        System.out.println("Aradiginiz kelimeyi giriniz");
        String aranan = scanner.nextLine();

        boolean bl = str.contains(aranan);
        System.out.println(bl);
    }
}
