package com.example.calculator;

class Actions {
    // Actions methods
    void sum(double n, double m) {
        double sum = n + m;
        System.out.println("The sum is: " + sum);
    }

    void diff(double n, double m) {
        double diff = n - m;
        System.out.println("The difference is:" + diff);
    }

    void prod(double n, double m) {
        double prod = n * m;
        System.out.println("The product is: " + prod);
    }

    void divide(double n, double m) {
        double divide = n / m;
        System.out.println("The division is: " + divide);
    }

    void sqr(double n) {
        double sqr = Math.pow(n, 2);
        System.out.println("The square of number is: " + sqr);
    }
}
