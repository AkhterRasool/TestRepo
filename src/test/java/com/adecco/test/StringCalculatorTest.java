package com.adecco.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

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

    @Test
    public void addUnknownAmountOfNumbers() {
        Random random = new Random();
        int totalNumbers = random.nextInt(500);
        StringBuilder inputString = new StringBuilder("");
        int expectedResult = 0;
        for (int i = 1; i <= totalNumbers; i++) {
            int currentNum = random.nextInt(totalNumbers);
            inputString.append(currentNum);
            expectedResult += currentNum;
            if (i < totalNumbers)
                inputString.append(",");
        }
        int actualResult = stringCalculator.add(inputString.toString());
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addNumbersHavingNewLines() {
        String inputString = "1\n2,3";
        int expectedResult = 6;
        int actualResult = stringCalculator.add(inputString);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addNumbersWithFlexibleDelimiter() {
        String inputString = "//;\n1;2;7";
        int expectedResult = 10;
        int actualResult = stringCalculator.add(inputString);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
