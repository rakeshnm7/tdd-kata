package com.tdd.app;

/**
 * Created by Rakesh.Kumar on 03-02-2021.
 **/

public class Parser {

    public static String[] extractNumbers(String numbers, String... defaultDelimiters)
    {
        //if custom delimiter us specified
        if (numbers.startsWith("//"))
        {
            String customDelimiter = numbers.substring(2,
                    numbers.indexOf("\n"));

            numbers = numbers.substring(numbers.indexOf("\n")+1);
            return numbers.split(customDelimiter);
        }
        numbers = numbers.replace(defaultDelimiters[0], " ").
                replace(defaultDelimiters[1], " ");
        return numbers.split(" ");
    }
}
