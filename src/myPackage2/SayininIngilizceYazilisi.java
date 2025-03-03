package myPackage2;

import java.util.Scanner;

public class SayininIngilizceYazilisi {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number...?");
            int number = scanner.nextInt();
            System.out.println(numberToWords(number));
        }

        public static String numberToWords(int num) {
            if (num == 0) return "zero";

            String[] belowTwenty = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            String[] thousands = {"", "thousand", "million", "billion"};

            String words = "";
            int i = 0;

            while (num > 0) {
                if (num % 1000 != 0) {
                    words = helper(num % 1000, belowTwenty, tens) + thousands[i] + " " + words;
                }
                num /= 1000;
                i++;
            }

            return words.trim();
        }

        private static String helper(int num, String[] belowTwenty, String[] tens) {
            if (num == 0) return "";
            else if (num < 20) return belowTwenty[num] + " ";
            else if (num < 100) return tens[num / 10] + " " + helper(num % 10, belowTwenty, tens);
            else return belowTwenty[num / 100] + " hundred " + helper(num % 100, belowTwenty, tens);
        }
    }

