package com.pluralsight;

import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
    /*   Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any value
you want. Print the answer (i.e "The highest salary is ...")*/
        int bobSalary = 50000;
        int garySalary = 75000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);
//  2. Find and display the smallest of two variables named carPrice and
//truckPrice. Set the variables to any value you want.
        int carPrice = 35000;
        int truckPrice = 65000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);
        //3. Find and display the area of a circle whose radius is 7.25
        float radius = 7.25f;
        float Area = (float)(Math.PI * Math.pow(radius, 2));
        System.out.println("The radius of the circle is " + Area);
//      4. Find and display the square root a variable after it is set to 5.0
        short variable = 5;
        double squareRoot = Math.sqrt(variable);
        System.out.println("The square root of 5 is " + squareRoot);
//5. Find and display the distance between the points (5, 10) and (85, 50)
        short x1 = 5;
        short y1 = 10;
        short x2 = 85;
        short y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between the points is " + distance);

//6. Find and display the absolute (positive) value of a variable after it is set to -3.8

//7. Find and display a random number between 0 and 1
        System.out.println(Math.random());

    }
}
