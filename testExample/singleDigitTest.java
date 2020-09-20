package com.test3.springboot;

import com.test3.springboot.controller.doubleDigit;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class singleDigitTest {

    @Test
    public void test1() {

        doubleDigit doubleDigitCombinations = new doubleDigit();

        int[] number = { 4 ,6 };
        ArrayList<String> combinations = doubleDigitCombinations.combinations(number);

        combinations.stream().forEach(one -> System.out.print(one + " "));

    }
    @Test
    public void test2() {

        doubleDigit doubleDigitCombinations = new doubleDigit();

        int[] number = { 4,7 ,6,2};
        ArrayList<String> combinations = doubleDigitCombinations.combinations(number);

        combinations.stream().forEach(one -> System.out.print(one + " "));

    }
    @Test

    public void test3() {

        doubleDigit doubleDigitCombinations = new doubleDigit();

        int[] number = { 6};
        ArrayList<String> combinations = doubleDigitCombinations.combinations(number);

        combinations.stream().forEach(one -> System.out.print(one + " "));

    }
    @Test

    public void test4() {

        doubleDigit doubleDigitCombinations = new doubleDigit();

        int[] number = { 0,4};
        ArrayList<String> combinations = doubleDigitCombinations.combinations(number);

        combinations.stream().forEach(one -> System.out.print(one + " "));

    }
    @Test

    public void test5() {

        doubleDigit doubleDigitCombinations = new doubleDigit();

        int[] number = { 1,22};
        ArrayList<String> combinations = doubleDigitCombinations.combinations(number);

        combinations.stream().forEach(one -> System.out.print(one + " "));

    }
}