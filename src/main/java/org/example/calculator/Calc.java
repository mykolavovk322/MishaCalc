package org.example.calculator;

public interface Calc {
    int add(int parameter1, int parameter2);

    int subtract(int parameter1, int parameter2);

    int multiply(int parameter1, int parameter2);

    int divide(int numerator, int denominator);

    double exponentiate(int baseNumber, int power);
    }
