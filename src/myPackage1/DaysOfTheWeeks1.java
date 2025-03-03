package myPackage1;

import java.util.Scanner;

public class DaysOfTheWeeks1 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner in = new Scanner(System.in);
            System.out.print("Input number: ");
            int day = in.nextInt();

            System.out.println(getDayName(day));
        }

        // Get the name for the Week
        public static String getDayName(int day) {
            return switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day range";
            };
        }
}
