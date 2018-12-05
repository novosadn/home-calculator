package com.example.calculator;

import com.example.calculator.ActionTypes.SquareAction;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to simple Calculator. Please enter 2 numbers and select one of the action");
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        double n = reader.nextDouble();
        System.out.print("What action would You like to do? + - * / ^: ");
        String chosenAction = reader.next();
        ActionCaller action = new ActionCaller();
        SquareAction square = new SquareAction();
        if (!chosenAction.equals("^")) {
            System.out.print("Enter the second number: ");
            double m = reader.nextDouble();
            reader.close();
            action.actionCaller(chosenAction, n, m);
        }
        else {
            square.sqr(n);
        }
    }
}
