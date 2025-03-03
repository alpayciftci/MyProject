package myPackage1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StrTerstenYazdirma {

    public static void main(String[] args) {

     /*----
     Girilen String değeri tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj

    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str = scanner.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        // Another Method
        System.out.println();

        String[] arr =str.split("");

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}