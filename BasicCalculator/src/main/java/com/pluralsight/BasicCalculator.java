package com.pluralsight;
import java.util.Scanner;


public class BasicCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Possible calculations: ");

        System.out.println("(A)dd");

        System.out.println("(S)ubtract");

        System.out.println("(M)ultiply");

        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String option = scanner.nextLine();

        if (option.equals("A")) {
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        }
        else if (option.equals("S")) {
            int difference = num1 - num2;
            System.out.println("The difference is: " + difference);
        }
        else if (option.equals("M")) {
            int product = num1 * num2;
            System.out.println("The product is: " + product);
        }
        else if (option.equals("D")) {
            int quotient = num1 / num2;
            System.out.println("The quotient is: " + quotient);
        }
        else {
            System.out.println("Cannot find option, please try again.");
        }
    }
}
