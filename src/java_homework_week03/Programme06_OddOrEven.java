package java_homework_week03;

import java.util.Scanner;

public class Programme06_OddOrEven {
    public static void main(String[] args) {

        Scanner c1 = new Scanner(System.in);
        System.out.println("Enter the value to check ODD or EVEN number : ");
        int number = c1.nextInt();
        Programme06_OddOrEven oddEven = new Programme06_OddOrEven();
        System.out.println(number + " is " + oddEven.isItEvenorOddNumber(number) + " number ");
        c1.close();
    }

    public String isItEvenorOddNumber(int number){
        if (number % 2 == 0) {
            return "Even";
        }else {
            return "Odd";
        }
    }
}
