package myPackage1;

import java.util.Scanner;

public class GirilenSayininCarpimi {

    public static void main(String[] args) {

        // Girilen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz...");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " x " + i + " = " + (sayi*i) );
        }
    }
}
