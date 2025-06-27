package com.assertionjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CalculatorAssertionsTest {
    
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(4, 6));
        assertTrue(calculator.add(5, 3) == 8);
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertFalse(calculator.subtract(5, 3) == 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
        assertNotNull(calculator.multiply(3, 5));
    }

   @Test
    public void testNullAssertions() {
        Object obj = null;
        Object nonNullObj = calculator.getObject();
        assertNull(obj);
    }

}

