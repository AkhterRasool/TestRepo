package com.adecco.test;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.contains(",")) {
            String[] elems = numbers.trim().split(",");
            int result = 0;
            for (String elem: elems) {
                result += Integer.parseInt(elem);
            }
            return result;
        }
        return numbers.isEmpty() ? 0 : Integer.parseInt(numbers);
    }
}
