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

    @Test
    public void addOneInteger() {
        String inputString = "1";
        int expectedResult = 1;
        int actualResult = stringCalculator.add(inputString);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addTwoIntegers() {
        String inputString = "1,2";
        int expectedResult = 3;
        int actualResult = stringCalculator.add(inputString);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
