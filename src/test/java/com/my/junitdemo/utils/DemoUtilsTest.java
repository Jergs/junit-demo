package com.my.junitdemo.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    private DemoUtils demoUtils;

    @BeforeEach
    void setUp() {
        demoUtils = new DemoUtils();
    }

    @Test
    void testArrayEquals() {
        String[] firstThreeLetters = {"A", "B", "C"};
        assertArrayEquals(firstThreeLetters, demoUtils.getFirstThreeLetters(), "Arrays are not equal");
    }

    @Test
    void testIterableEquals() {
        List<String> listOfStudents = List.of("Andrew", "Geralt", "Andraste");
        assertIterableEquals(listOfStudents, demoUtils.getListOfStudents(), "Iterables are not equal");
    }

    @Test
    void testLinesMatch() {
        List<String> listOfStudents = List.of("Andrew", "Geralt", "Andraste");
        assertLinesMatch(listOfStudents, demoUtils.getListOfStudents(), "Iterables are not equal");
    }

    @Test
    void testThrows() {
        assertThrows(Exception.class, () -> demoUtils.throwException(-1), "Exception thrown");

        assertDoesNotThrow(() -> demoUtils.throwException(9), "Exception must not be thrown");
    }

    @Test
    void checkTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> demoUtils.chechTimeout());
    }

}