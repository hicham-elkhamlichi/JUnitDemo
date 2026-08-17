package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test // marks a method as a test method
    public void addTest() {
        Calculator calculator = new Calculator();
        int result = calculator.add(14, 7);

        assertEquals(21,result);
    }
}
