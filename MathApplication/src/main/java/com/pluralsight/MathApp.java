package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        //Question 1
        int bobSalary = 65000;
        int garySalary = 87000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: " + highestSalary);

        //Question 2
        int carPrice = 14000;
        int truckPrice = 22000;

        int lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is: " + lowestPrice);

        //Question 3
        double circleRadius = 7.25f;
        double areaFormula = 3.14f * (circleRadius * circleRadius);

        System.out.println("The area of the circle is: " + areaFormula);


        //Question 4
        float num = 5.0f;
        double squareRootFormula = (num * num);

        System.out.println("The square root of this number is: " + squareRootFormula);

        //Question 5
        // create variables for the points
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        // formula is distance = square root (x2 - x1)² + (y2 - y1)²
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("This distance between the two points is: " + distance);

        //Question 6

        float num2 = -3.8f;
        float result = Math.abs(num2);

        System.out.println("The absolute value is: " + result);

        //Question 7

        double randomNum = Math.random();

        System.out.println("Here is a random number between 0 and 1: " + randomNum);
    }
}
