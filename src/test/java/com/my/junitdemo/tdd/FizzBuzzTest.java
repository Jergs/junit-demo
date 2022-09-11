package com.my.junitdemo.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {

    @Test
    @DisplayName("Divisible by three")
    @Order(1)
    void testForDivisibleByThree() {
        String expected = "Fizz";
        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    @Test
    @DisplayName("Divisible by five")
    @Order(2)
    void testForDivisibleByFive() {
        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

    @Test
    @DisplayName("Divisible by three and five")
    @Order(3)
    void testForDivisibleByThreeAndFive() {
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    @Test
    @DisplayName("Not divisible by three or five")
    @Order(4)
    void testForNotDivisibleByThreeAndFive() {
        String expected = "1";
        assertEquals(expected, FizzBuzz.compute(1), "Should return '1'");
    }

    @ParameterizedTest(name="value={0}, expected={1}")
    @DisplayName("Testing wit small Data file")
    @Order(5)
    @CsvFileSource(resources = "/small-test-data.csv")
    void testSmallDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));
    }

}
