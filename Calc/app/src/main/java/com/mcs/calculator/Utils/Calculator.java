package com.mcs.calculator.Utils;

/**
 * The Calculator class represents a calculator with basic arithmetic operations
 * constructors: Calculator()
 * methods: add(), subtract(), multiply(), divide()
 */
public class Calculator {
    public Calculator(){}

    public double add(double a, double b){ return a+b; }
    public double subtract(double a, double b){ return a-b; }
    public double multiply(double a, double b){ return a*b; }
    public double divide(double a, double b){ return a/b; }

    /**
     * divide() --
     * Computes remainder if rem is true. Otherwise, computes result.
     * @param a
     * @param b
     * @param rem
     * @return double
     */
    public double divide(double a, double b, boolean rem){ return rem? a%b: a/b; }

    /**
     * abs() --
     * Computes the absolute value.
     * @param value
     * @return double
     */
    public double abs(double value){return value < 0? value*-1: value;}

    /**
     * pow() --
     * Uses Math library to compute exponential powers.
     * @param base
     * @param exponent
     * @return double
     */
    public double pow(double base, double exponent){ return Math.pow(base, exponent); }
}
