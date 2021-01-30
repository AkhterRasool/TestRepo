package com.adecco.test;

public class StringCalculator {
    public int add(String numbers) {
        String[] elems = numbers.trim().split("[,\n]");
        int result = 0;
        for (String elem: elems) {
            try {
                result += Integer.parseInt(elem);
            } catch (NumberFormatException ex) {}
        }
        return result;
    }
}
