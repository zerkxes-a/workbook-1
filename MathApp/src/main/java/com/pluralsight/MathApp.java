package com.pluralsight;

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
        float pi = 3.14159f;
        float Area = (pi * (radius * radius));
        System.out.println(Area);
//      4. Find and display the square root a variable after it is set to 5.0
        short variable = 5;
        double squareRoot = Math.sqrt(variable);
        System.out.println(squareRoot);



    }
}
