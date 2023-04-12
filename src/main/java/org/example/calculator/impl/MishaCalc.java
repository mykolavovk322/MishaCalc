package org.example.calculator.impl;

import org.example.calculator.Calc;

public class MishaCalc implements Calc {
    public int add(int parameter1, int parameter2) {
        return parameter1 + parameter2;
    }

    public int subtract(int parameter1, int parameter2) {
        return parameter1 - parameter2;
    }

    public int multiply(int parameter1, int parameter2) {
        return parameter1 * parameter2;
    }

    public int divide(int numerator, int denominator) {
        int fraction = 0;
        try {
            fraction = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        }
        return fraction;
    }
}
