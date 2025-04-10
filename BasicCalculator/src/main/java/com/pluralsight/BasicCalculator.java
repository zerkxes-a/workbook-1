package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
        System.out.println("Possible calculations: \n (A)dd\n (S)ubtract\n (M)ultiply\n (D)ivide");
        System.out.println("Please select an option: ");

        String option = input.nextLine();
         double total = num1 * num2;
        System.out.println("multiply numbers: " + total);







    }
}
