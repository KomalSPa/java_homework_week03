package java_homework_week03;

import java.util.Scanner;

public class Programme07_SalesDetail {
    public static void main(String[] args) {


        Scanner h1 = new Scanner(System.in);
        System.out.println("Enter Seller Name: ");
        String name = h1.nextLine();
        System.out.println("Enter Seller ID: ");
        int sellerID = h1.nextInt();
        System.out.println("Enter Sales Amount: ");
        int salesAmount = h1.nextInt();
        System.out.println("Enter Basic Salary: ");
        int basicSalary = h1.nextInt();

        Programme07_SalesDetail salesCommission = new Programme07_SalesDetail();
        int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller Name is            : " + name);
        System.out.println("Seller ID is              : " + sellerID);
        System.out.println("Seller's Sales Amount is  : " + salesAmount);
        System.out.println("Seller's Basic Salary is  : " + basicSalary);
        System.out.println("Seller's Gross Salary is  : " + grossSalary);

        h1.close();
    }

    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }


}
