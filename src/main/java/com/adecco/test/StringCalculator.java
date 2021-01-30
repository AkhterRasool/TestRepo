package com.adecco.test;

public class StringCalculator {
    public int add(String numbers) {
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            delimiter = String.valueOf(numbers.charAt(2));
        }
        String[] elems = numbers.trim().split("[" + delimiter + "\n]");
        int result = 0;
        for (String elem: elems) {
            try {
                result += Integer.parseInt(elem);
            } catch (NumberFormatException ex) {}
        }
        return result;
    }
}
