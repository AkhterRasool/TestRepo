package com.adecco.test;

import java.util.LinkedList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        char delimiter = ',';
        if (numbers.startsWith("//")) {
            delimiter = numbers.charAt(2);
        }
        String[] elems = numbers.trim().split("[" + delimiter + "\n]");
        int result = 0;
        List<Integer> negativeNumbers = new LinkedList<>();
        for (String elem: elems) {
            try {
                int currentNumber = Integer.parseInt(elem);
                if (currentNumber < 0) {
                    negativeNumbers.add(currentNumber);
                }
                result += currentNumber;
            } catch (NumberFormatException ex) {}
        }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed " + negativeNumbers.toString());
        }
        return result;
    }
}
