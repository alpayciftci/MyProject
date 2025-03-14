package myPackage3;

import java.util.Scanner;

public class EmailControl {
    /*45-----
    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden bir program yazınız.

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email address...");
        String email = scanner.nextLine();
        System.out.println(validateEmail(email));
    }

    public static boolean validateEmail(String email) {
        return email.contains(".") && email.contains("@") && email.charAt(0) != '@';
    }
}
