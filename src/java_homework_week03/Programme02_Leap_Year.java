package java_homework_week03;

import java.util.Scanner;
public class Programme02_Leap_Year {
    public static void main(String[] args) {
        Scanner f1 = new Scanner(System.in);
        System.out.println("Input the Year: ");
        int year = f1.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) !=0;
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if(x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
