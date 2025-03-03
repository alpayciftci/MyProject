package myPackage1;

import java.util.Random;

public class DaysOfTheWeeks2 {

    public static void main(String[] args) {

        System.out.println("Using Standard Switch Case");
        System.out.println(getDayName(1));
        System.out.println(getDayName(3));
        System.out.println(getDayName(5));
        System.out.println(getDayName(7));
        System.out.println(getDayName(9));

        System.out.println("-----------------------");

        System.out.println("Using New Switch Case:");
        System.out.println(getNewDayName(1));
        System.out.println(getNewDayName(2));
        System.out.println(getNewDayName(5));
        System.out.println(getNewDayName(6));
        System.out.println(getNewDayName(11));

    // Random generated day

        int day = new Random().nextInt(7) + 1;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.printf("%d: %s%n", day, dayName);
    }

    /**
     * Function with 'standard' switch
     *
     * @param day
     * @return String dayName
     */
    public static String getDayName(int day) {
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        return dayName;
    }

    /**
     * Function with 'new-style' switch
     *
     * @param day
     * @return String dayName
     */
    public static String getNewDayName(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
    }



}

