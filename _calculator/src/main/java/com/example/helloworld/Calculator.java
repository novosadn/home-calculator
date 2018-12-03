package com.example.helloworld;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to simple Calculator. Please enter 2 numbers and select one of the action");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double n = reader.nextDouble();
        System.out.println("What action would You like to do? + - * / ^");
        String chosenAction = reader.next();
        Actions action = new Actions();
        if (!chosenAction.equals("^")) {
            System.out.println("Enter the second number: ");
            double m = reader.nextDouble();
            reader.close();

            switch (chosenAction) {
                case "+":
                    action.sum(n, m);
                    break;
                case "-":
                    action.diff(n, m);
                    break;
                case "*":
                    action.prod(n, m);
                    break;
                case "/":
                    action.divide(n, m);
                    break;
                default:
                    System.out.println("Wrong action is selected:");
                    break;
            }
        }
        else {
            action.sqr(n);
        }
    }
}
