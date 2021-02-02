package com.tdd.app;

import java.util.stream.Stream;

/**
 * Created by Rakesh.Kumar on 02-02-2021.
 **/

public class StringCalculator {

    /**
     * Create a simple String calculator with a method signature:
     * The method can take up to two numbers, separated by commas, and will return their sum.
     */
    public int add(String numbers)
    {
        if (numbers == null || numbers.isEmpty())
        {
            return 0;
        }

        String[] numbersToBeAdded = numbers.split(",");

        return addNumbers(numbersToBeAdded);

    }

    /**
     * handling sum of unknown amount of numbers
     */
    public int addNumbers(String[] numbers)
    {
        return Stream.of(numbers).mapToInt(Integer::parseInt).sum();
    }
}
