package com.adecco.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    private static StringCalculator stringCalculator;

    @BeforeAll
    public static void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testSumOfEmptyString() {
        String inputString = "";
        int result = stringCalculator.add(inputString);
        Assertions.assertEquals(0, result);
    }

}
