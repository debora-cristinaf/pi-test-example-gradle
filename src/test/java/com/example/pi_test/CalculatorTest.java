package com.example.pi_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

//    @Test
//    void isPrime() {
//        assertTrue(calculator.isPrime(2));
//    }

    @Test
    public void shouldVerifyIsPrime() {

        assertFalse(calculator.isPrime(-1), "-1 should not be prime");
        assertFalse(calculator.isPrime(0), "0 should not be prime");
        assertFalse(calculator.isPrime(1), "1 should not be prime");
        assertTrue(calculator.isPrime(2), "2 should be prime");
        assertFalse(calculator.isPrime(4), "4 should not be prime");
        assertTrue(calculator.isPrime(7), "7 should be prime");
    }
}