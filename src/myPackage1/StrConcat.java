package myPackage1;

import java.util.Scanner;

public class StrConcat {
    public static void main(String[] args) {

    /*----
    2 farklı String'i  uc uca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki kelime giriniz : ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = str1.concat(" " + str2);

        System.out.println(str1 + " ".concat(str2));
        System.out.println(str1 + " " + str2);
        System.out.println(str3);

    }
}
