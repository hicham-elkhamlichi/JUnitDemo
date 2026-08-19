package com.example.annotations;

import com.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operations Test")
public class CalculatorTest {

    @DisplayName("Test Addition")
    @Test
    void addTest() {
        Calculator calculator = new Calculator();
        int addition = calculator.add(2, 5);

        assertEquals(7, addition);
    }

    @DisplayName("Test Subtract")
    @Test
    void SubtractTest() {
        Calculator calculator = new Calculator();
        int subtracted = calculator.subtract(2, 5);

        assertEquals(-3, subtracted);
    }
}
