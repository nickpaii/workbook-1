package com.pluralsight;


public class Methods {

    public static void main(String[] args) {
//      Method 1
        brushTeeth();

//      Method 2
        String movie = favMovie();
        System.out.println(movie);

//      Method 3
        int sum = sumNums(20, 20);
        System.out.println(sum);
    }


//  Brush Teeth Method
    public static void brushTeeth() {


        System.out.println("grab toothbrush");
        System.out.println("apply toothpaste to toothbrush");
        System.out.println("brush teeth");


    }

//  Favorite Movie Method
    public static String favMovie() {

        return "The Little Rascals";
    }

//  Sum of Numbers Method
    public static int sumNums(int num1, int num2){

        return num1 + num2;
    }
}
