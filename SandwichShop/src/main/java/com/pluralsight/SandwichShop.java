package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        float regularSize = 5.45f;
        float largeSize = 8.95f;

        System.out.println("Hi, welcome to the sandwich stop n' shop!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Regular is $5.45 and Large is $8.95");
        System.out.print("Would you like a Regular or Large size? ");


        String size = scanner.nextLine();

        System.out.print("We're also giving out student and senior discounts today! How old are you? ");
        int age = scanner.nextInt();

        float studentRegDiscount = discountCalc("Regular", age);
        float studentLargeDiscount = discountCalc("Large", age);

        float seniorRegDiscount = discountCalc("Regular", age);
        float seniorLargeDiscount = discountCalc("Large", age);

        if (age > 17 && age < 65 && size.equals("Regular")){
            System.out.printf("Your total is: $%.2f ", regularSize);
        }
        else if (age > 17 && age < 65 && size.equals("Large")) {
            System.out.printf("Your total is: $%.2f ", largeSize);
        }
        else if (age <= 17 && size.equals("Regular")) {
            System.out.printf("Your total is: $%.2f ", studentRegDiscount);
        }
        else if (age <= 17 && size.equals("Large")) {
            System.out.printf("Your total is: $%.2f ", studentLargeDiscount);
        }
        else if (age >= 65 && size.equals("Regular")) {
            System.out.printf("Your total is: $%.2f ", seniorRegDiscount);
        }
        else if (age >= 65 && size.equals("Large")) {
            System.out.printf("Your total is: $%.2f ", seniorLargeDiscount);
        }
        else {
            System.out.println("Have a nice day!");
        }

        System.out.println("Have a nice day, enjoy your sandwich!");
    }

    public static float discountCalc(String size, int age) {

        float regularStudentDiscount = 5.45f - (5.45f * .1f);
        float largeStudentDiscount = 8.95f - (8.95f * .1f);

        float regularSeniorDiscount = 5.45f - (5.45f * .2f);
        float largeSeniorDiscount = 8.95f - (8.95f * .2f);

        if (age <= 17 && size.equals("Regular")) {
            return regularStudentDiscount;
        }
        else if (age <= 17 && size.equals("Large")) {
            return largeStudentDiscount;
        }
        else if (age >= 65 && size.equals("Regular")) {
            return regularSeniorDiscount;
        }
        else if (age >= 65 && size.equals("Large")) {
            return largeSeniorDiscount;
        }
        else {
            return .0f;
        }
    }
}
