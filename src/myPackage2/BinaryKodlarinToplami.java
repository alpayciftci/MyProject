package myPackage2;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryKodlarinToplami {
    public static void main(String[] args) {

        /*---
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010

    Beklenen Çıktı:
    1010100
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki binary sayi giriniz...");
        String binary1 = scanner.nextLine();
        String binary2 = scanner.nextLine();
        String result = addBinary(binary1, binary2);
        String result2 = addBinary2(binary1, binary2);
        System.out.println("Sum: " + result);
        System.out.println("Sum2: " + result2);
    }
      //   1. Yol
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        while (aLen >= 0 || bLen >= 0 || carry == 1) {
            int sum = carry;
            if (aLen >= 0) sum += a.charAt(aLen--) - '0';
            if (bLen >= 0) sum += b.charAt(bLen--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }
        //   2. Yol
    // Using BigInteger Class
    public static String addBinary2 (String a, String b){
        // Convert binary strings to BigInteger
         BigInteger num1 = new BigInteger(a, 2);
         BigInteger num2 = new BigInteger(b, 2);
         // Add the two numbers
         BigInteger sum = num1.add(num2);
        System.out.println(sum); // To see the decimal value of the sum...
        // Convert the sum back to a binary string
        return sum.toString(2);
    }
}