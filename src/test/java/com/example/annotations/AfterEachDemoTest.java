package com.example.annotations;

import com.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfterEachDemoTest {

    private static Calculator calculator;
//    @BeforeEach
//    void setUp() {
//        calculator = new Calculator();
//        System.out.println("SetUp method calling..");
//    }
    @BeforeAll
    static void setUpBeforeAll() {
        calculator = new Calculator();
        System.out.println("setUpBeforeAll method is calling..");
    }


    @AfterEach
    void tearDown() {
        System.out.println("tearDown method calling..");
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("executing after all method");
    }

    @Test
    void addTest() {
        // calculator.add(3, 2);
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
