package java_homework_week03;

public class Programme11_Devide03And05 {


public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are: ");
        for (int i = 1; i <= 100; i++) {
        dividedByThree(i);
        }
        System.out.println(" ");
        System.out.println("Numbers divisible by 5 are: ");
        for (int x = 1; x <= 100; x++) {
        dividedByFive(x);
        }
        }

public static void dividedByThree(int number) {
        if (number % 3 == 0) {
        System.out.print(number + ",");
        }
        }

public static void dividedByFive(int number) {
        if (number % 5 == 0) {
        System.out.print(number + ",");
        }
        }}
