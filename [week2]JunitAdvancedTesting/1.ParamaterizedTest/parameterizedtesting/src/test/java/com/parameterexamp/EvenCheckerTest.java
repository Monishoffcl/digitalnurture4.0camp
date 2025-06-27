package com.parameterexamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenCheckerTest {
    
    private final EvenChecker evenChecker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, -2, -4, 100, 1024}) 
    void testIsEvenWithEvenNumbers(int number) {
        Assertions.assertTrue(evenChecker.isEven(number), 
            () -> number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -1, -3, 99, 1023}) 
    void testIsEvenWithOddNumbers(int number) {
        Assertions.assertFalse(evenChecker.isEven(number), 
            () -> number + " should not be even");
    }
}
