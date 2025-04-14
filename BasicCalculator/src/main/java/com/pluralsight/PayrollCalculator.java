package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String name = scanner.nextLine();

        System.out.print("Please enter your hours worked: ");

        float hours = scanner.nextFloat();

        System.out.print("Please enter your pay rate: ");

        float pay = scanner.nextFloat();

        float grossPay = hours * pay;

        System.out.printf("Name: %s \nGross Pay: $%.2f", name, grossPay);
    }
}
