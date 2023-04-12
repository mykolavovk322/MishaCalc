package org.example;

import org.example.calculator.impl.MishaCalc;

public class Main {
    public static void main(String[] args) {
        MishaCalc calc = new MishaCalc();
        System.out.println(calc.add(1,1));
        System.out.println(calc.divide(1,0));
    }
}