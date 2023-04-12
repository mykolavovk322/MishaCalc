package org.example.calculator.impl;

import org.example.calculator.Calc;

public class MishaCalc implements Calc {
    public int add(int parameter1, int parameter2) {
        System.out.println("Using add method");
        return parameter1 + parameter2;
    }

    public int subtract(int parameter1, int parameter2) {
        System.out.println("Using subtract method");
        return parameter1 - parameter2;
    }

    public int multiply(int parameter1, int parameter2) {
        System.out.println("Using multiply method");
        return parameter1 * parameter2;
    }

    public int divide(int numerator, int denominator) {
        System.out.println("Using divide method");
        int fraction = 0;
        try {
            fraction = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        }
        return fraction;
    }
}
