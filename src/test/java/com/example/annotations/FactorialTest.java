package com.example.annotations;

import com.example.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void factorialTest() {
        Factorial factorial = new Factorial();
        int fact = factorial.factorial(5);
        assertEquals(120, fact);
    }

}