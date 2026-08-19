package com.example.annotations;

import com.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeEachDemoTest {

    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("SetUp method calling..");
    }

    @Test
    void addTest() {
        //calculator.add(3, 2);
        assertEquals(5, calculator.add(3, 2));
    }


    @Test
    void SubtractTest() {
        int subtracted = calculator.subtract(2, 5);
        assertEquals(-3, subtracted);
    }


    @Test
    void divideTest() {
        int divided = calculator.divide(20, 5);
        assertEquals(4, divided);
    }
}
