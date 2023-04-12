package org.example;

public class Calc {
    public int add(int parameter1, int parameter2) {
        return parameter1 + parameter2;
    }

    public int subtract(int parameter1, int parameter2) {
        return parameter1 - parameter2;
    }

    public int multiply(int parameter1, int parameter2) {
        return parameter1 * parameter2;
    }

    public int divide(int parameter1, int parameter2) {
        if (parameter2 == 0) {
            throw new ArithmeticException("You cant divide by zero");
        }
        return parameter1 / parameter2;
    }
}
