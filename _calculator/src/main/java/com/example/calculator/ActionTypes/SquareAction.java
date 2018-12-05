package com.example.calculator.ActionTypes;

public class SquareAction {
    public void sqr(double n) {
        double sqr = Math.pow(n, 2);
        System.out.println("The square of number is: " + sqr);
    }
}
