package com.my.junitdemo.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DemoUtils {

    private String[] firstThreeLetters = {"A", "B", "C"};
    private List<String> listOfStudents = List.of("Andrew", "Geralt", "Andraste");

    public String throwException(int a) throws Exception {
        if (a < 0)
            throw new Exception("Value should be greater than or equal to 0");
        return "Value is valid";
    }

    public void chechTimeout() throws InterruptedException {
        System.out.println("Going to sleep");
        Thread.sleep(2000);
        System.out.println("Sleeping over");
    }

}
