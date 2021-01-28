package tutorial.example.day2;

import java.time.DayOfWeek;

public class Condition {
    public static void main(String[] args) {
        processNumber(3);
        System.out.println();
        processNumber(8);
        System.out.println();
        processNumber(29);
        System.out.println();
        processNumber(86);
        System.out.println();
        processNumber(1234);
        System.out.println();
        processNumber(4321);
        System.out.println();
        processNumber(333333);
        System.out.println();
        processNumber(100);
        System.out.println();

        processDay(DayOfWeek.MONDAY);
        processDay(DayOfWeek.TUESDAY);
        processDay(DayOfWeek.WEDNESDAY);
        processDay(DayOfWeek.THURSDAY);
        processDay(DayOfWeek.FRIDAY);
        processDay(DayOfWeek.SATURDAY);
        processDay(DayOfWeek.SUNDAY);

    }

    public static void processNumber(int number) {
        System.out.println("The number is " + number);
        if (number >= 0 && number < 10) {
            System.out.println("single digits number");
        } else if (number >= 10 && number < 100) {
            System.out.println("two-digits number");
        } else if (number >= 100 && number < 1000) {
            System.out.println("three-digits number");
        } else if (number >= 1000 && number < 10000) {
            System.out.println("four-digits number");
        } else {
            System.out.println("I cannot count number larger than 10000");
        }

        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void processDay(DayOfWeek day) {
        switch(day) {
            case MONDAY:
                System.out.println("today is Monday");
                break;
            case TUESDAY:
                System.out.println("today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("today is Thursday");
                break;
            case FRIDAY:
                System.out.println("today is Friday");
                break;
            case SATURDAY:
                System.out.println("today is Saturday");
                break;
            default:
                System.out.println("today is Sunday");
        }
    }
}
