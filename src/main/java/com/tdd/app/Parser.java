package com.tdd.app;

/**
 * Created by Rakesh.Kumar on 03-02-2021.
 **/

public class Parser {

    public static String[] extractNumbers(String numbers, String... defaultDelimiters)
    {
        numbers = numbers.replace(defaultDelimiters[0], " ").
                replace(defaultDelimiters[1], " ");
        return numbers.split(" ");
    }
}
