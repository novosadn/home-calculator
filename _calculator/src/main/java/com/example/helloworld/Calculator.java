package com.example.helloworld;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to simple Calculator. Please enter 2 numbers and select one of the action");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double n = reader.nextDouble();
        System.out.println("What action would You like to do? +; -; *; /; ^");
        String action = reader.next();
        if (!action.equals("^")) {
            System.out.println("Enter the second number: ");
            double m = reader.nextDouble();
            reader.close();

            if (action.equals("+")) {
                double sum = n + m;
                System.out.println("The sum is: " + sum);
            } else if (action.equals("-")) {
                double diff = n - m;
                System.out.println("The difference is:" + diff);
            } else if (action.equals("*")) {
                double prod = n * m;
                System.out.println("The product is: " + prod);
            } else if (action.equals("/")) {
                double divide = n / m;
                System.out.println("The division is: " + divide);
            }
            else {
                System.out.println("Wrong action is selected:");
            }
        }
        else {
            System.out.println("The sqr is: " + n*n);
        }

    }
}
