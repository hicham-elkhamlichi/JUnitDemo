package com.example.annotations;

import com.example.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DisabledCalculatorTest {

    @Test
    void addTest() {
        Calculator calculator = new Calculator();
        //calculator.add(3, 2);

        assertEquals(5, calculator.add(3, 2));
    }

    @DisplayName("Test Subtract")
    @Disabled("Not implemented yet")
    @Test
    void SubtractTest() {
        Calculator calculator = new Calculator();
        int subtracted = calculator.subtract(2, 5);

        // .....
    }

    @DisplayName("Test Division")
    @Disabled
    @Test
    void divideTest() {
        Calculator calculator = new Calculator();
        int divided = calculator.divide(20, 5);

        assertEquals(7, divided);
    }
}
