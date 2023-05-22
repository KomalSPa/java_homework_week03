package java_homework_week03;

import java.util.Scanner;

public class Programme16_PositiveNegative {
    public static void main(String[] args) {
        Scanner k1 = new Scanner(System.in);
        System.out.println(" Input a Number : ");
        int a = k1.nextInt();
        numberPositiveOrNegative(a);
        k1.close();
    }

        public static void numberPositiveOrNegative(int a) {
            if (a > 0) {
                System.out.println(a + " is an positive number");
            } else if (a < 0) {
                System.out.println(a + " is a negative number");
            } else {
                System.out.println(a + " is zero");
            }
        }

    }
