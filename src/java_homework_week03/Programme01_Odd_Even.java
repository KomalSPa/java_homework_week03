package java_homework_week03;

import java.util.Scanner;

public class Programme01_Odd_Even {

public static void main(String [] args) {
    Scanner x1 = new Scanner(System.in);
    System.out.println("Input the number");
    int num = x1.nextInt();
x1.close();
    String evenOdd = (num % 2 == 0) ? "even" : "odd";
    System.out.println(num + " is " + evenOdd);

        }
}
