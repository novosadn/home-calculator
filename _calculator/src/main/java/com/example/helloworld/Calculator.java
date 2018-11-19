package com.example.helloworld;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to simple Calculator. Please enter 2 numbers and select one of the action");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double n = reader.nextDouble();
        System.out.println("What action would You like to do? 1)+; 2)-; 3)*; 4)/; 5)square");
        int action = reader.nextInt();
        if (action != 5) {
            System.out.println("Enter the second number: ");
            double m = reader.nextDouble();

            reader.close();

            double sum = n + m;
            double diff = n - m;
            double divide = n / m;
            double prod = n * m;

            if (action == 1) {
                System.out.println("The sum is: " + sum);
            } else if (action == 2) {
                System.out.println("The difference is:" + diff);
            } else if (action == 3) {
                System.out.println("The product is: " + prod);
            } else if (action == 4) {
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
