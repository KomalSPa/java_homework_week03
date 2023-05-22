package java_homework_week03;

import java.util.Scanner;

public class Programme12_NumberAndAlphabet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        Programme12_NumberAndAlphabet inputValue = new Programme12_NumberAndAlphabet();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);

        scanner.close();
    }

    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is a Symbol.");
        }
    }
}

