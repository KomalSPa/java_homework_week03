package java_homework_week03;

import java.util.Scanner;

public class Programme09_Switch_CityNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = scanner.next().toUpperCase();

        Programme09_Switch_CityNames cityName = new Programme09_Switch_CityNames();
        cityName.printCityName(city);

        scanner.close();
    }

    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Atlanta");
                break;
            case "B":
                System.out.println("Benoni");
                break;
            case "C":
                System.out.println("California");
                break;
            case "D":
                System.out.println("Doha");
                break;
            case "E":
                System.out.println("El Paso");
                break;
            case "F":
                System.out.println("Franca");
                break;
            default:
                System.out.println("The Alphabet you have entered is not between A to F");
        }
    }
}

