package java_homework_week03;

import java.util.Scanner;

public class Programme08_CityNames {
    public static void main(String[] args) {
        Scanner g1 = new Scanner(System.in);
        System.out.println("Please Enter Alphabet between A to F : ");
        char city = g1.next().charAt(0);
        Programme08_CityNames cityName = new Programme08_CityNames();
        cityName.printCityName(city);
        g1.close();
    }

    public void printCityName(char city){
        if (city == 'A' || city == 'a'){
            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bristol");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Derby");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Frankfurt");
        } else {
            System.out.println("The Alphabet you have entered is not between A to F ");
        }


    }}