package com.example.calculator;

import com.example.calculator.ActionTypes.*;


class ActionCaller {

    private ProductAction product = new ProductAction();
    private SumAction sum = new SumAction();
    private DivideAction divide = new DivideAction();
    private DiffAction diff = new DiffAction();

    void actionCaller (String action, double n, double m) {

            switch (action) {
                case "+":
                    sum.sum(n, m);
                    break;
                case "-":
                    diff.diff(n, m);
                    break;
                case "*":
                    product.prod(n, m);
                    break;
                case "/":
                    divide.divide(n, m);
                    break;
                default:
                    System.out.println("Wrong action is selected:");
                    break;
            }
        }
    }
