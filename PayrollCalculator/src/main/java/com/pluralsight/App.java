package com.pluralsight;


import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();
        System.out.print("Please enter your hours worked: ");
        float hours = keyboard.nextFloat();
        System.out.print("please enter your pay rate: ");
        float payRate = keyboard.nextFloat();

        System.out.println("Employee Name: " + name + "Pay Rate: " + payRate * hours);
        System.out.printf("Employee Name: %s, Pay Rate: %.2f", name, payRate * hours);

    }
}
