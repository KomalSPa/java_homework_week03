package java_homework_week03;

import java.util.Scanner;

public class Programme13_1to7Days {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7 : ");
        int day = scanner.nextInt();
        findTheDaysName(day);

        scanner.close();
    }

    public static void findTheDaysName(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("A Week contains only 7 days, Please try again.");
        }
}}
