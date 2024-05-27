package com.example.pi_test;

import java.util.stream.IntStream;

public class Calculator {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        return IntStream.range(2, number)
                .noneMatch(i -> number % i == 0);
    }
}