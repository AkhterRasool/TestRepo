package com.adecco.test;

public class StringCalculator {
    public int add(String numbers) {
        return numbers.isEmpty() ? 0 : Integer.parseInt(numbers);
    }
}
