package com.example.pi_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

//    @Test
//    void isPrime() {
//        calculator.isPrime(1);
//        calculator.isPrime(2);
//        assertTrue(true);
//    }

    @Test
    public void testIsPrime() {
        Calculator calc = new Calculator();

        assertFalse(calc.isPrime(-1), "-1 should not be prime");
        assertFalse(calc.isPrime(0), "0 should not be prime");
        assertFalse(calc.isPrime(1), "1 should not be prime");
        assertTrue(calc.isPrime(2), "2 should be prime");
        assertTrue(calc.isPrime(3), "3 should be prime");
        assertFalse(calc.isPrime(4), "4 should not be prime");
        assertTrue(calc.isPrime(5), "5 should be prime");
        assertFalse(calc.isPrime(6), "6 should not be prime");
        assertTrue(calc.isPrime(7), "7 should be prime");
        assertFalse(calc.isPrime(8), "8 should not be prime");
        assertFalse(calc.isPrime(9), "9 should not be prime");
        assertFalse(calc.isPrime(10), "10 should not be prime");
        assertTrue(calc.isPrime(11), "11 should be prime");
    }
}