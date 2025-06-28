package com.aaapatternjunit;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {
    private SimpleCalculator calculator;

    @Before
    public void setUp() {
        calculator = new SimpleCalculator();
    }

    @After
    public void tearDown() {
        calculator = null; 
    }

    @Test
    public void testAdd() {
        int a = 5;
        int b = 3;
        int expected = 8;

        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 3;
        int expected = 2;

        int result = calculator.subtract(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
    
        int a = 5;
        int b = 3;
        int expected = 15;

        int result = calculator.multiply(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testDivide() {
        
        int a = 6;
        int b = 3;
        double expected = 2.0;
        double result = calculator.divide(a, b);
        assertEquals(expected, result, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int a = 10;
        int b = 0;
    calculator.divide(a, b);
    }
}
