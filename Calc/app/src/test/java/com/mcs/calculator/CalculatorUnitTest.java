package com.mcs.calculator;

import com.mcs.calculator.Utils.Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorUnitTest {

    private Calculator calculator;

    @Before
    public void arrangeCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void addIntShouldPass() {
        final double ACTUAL = 5+2;
        final double EXPECTED = calculator.add(5,2);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void addFloatShouldPass(){
        final double ACTUAL = 3.6+1.3;
        final double EXPECTED = calculator.add(3.6, 1.3);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void subtractIntShouldPass(){
        final double ACTUAL = 5-2;
        final double EXPECTED = calculator.subtract(5,2);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void subtractFloatShouldPass(){
        final double ACTUAL = 3.6-1.3;
        final double EXPECTED = calculator.subtract(3.6, 1.3);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void subtractNegativeShouldPass(){
        final double ACTUAL = 1.3-3.6;
        final double EXPECTED = calculator.subtract(1.3, 3.6);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void multiplyIntShouldPass(){
        final double ACTUAL = 5*2;
        final double EXPECTED = calculator.multiply(5,2);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void multiplyFloatShouldPass(){
        final double ACTUAL = 3.6*1.3;
        final double EXPECTED = calculator.multiply(3.6, 1.3);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void divideIntShouldPass(){
        final double ACTUAL = 5/2.0;
        final double EXPECTED = calculator.divide(5,2);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void divideFloatShouldPass(){
        final double ACTUAL = 3.6/1.3;
        final double EXPECTED = calculator.divide(3.6, 1.3);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void divideShouldReturnRemainder(){
        final double ACTUAL = 8%3;
        final double EXPECTED = calculator.divide(8, 3, true);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void absShouldPass(){
        final double ACTUAL = 10;
        final double EXPECTED = calculator.abs(calculator.subtract(0, 10));
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @Test
    public void powShouldPass(){
        final double ACTUAL = 100;
        final double EXPECTED = calculator.pow(10,2);
        assertEquals(EXPECTED, ACTUAL, 0);
    }

    @After
    public void bunkDestroy(){
        calculator = null;
    }
}