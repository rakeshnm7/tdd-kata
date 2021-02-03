package com.tdd.app;

import java.util.stream.Collectors;
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

        String[] numbersToBeAdded = Parser.extractNumbers(numbers, ",","\n");
        throwsExceptionIfAtLeastOneNegative(numbersToBeAdded);
        return addNumbers(numbersToBeAdded);

    }

    /**
     * handling sum of unknown amount of numbers
     */
    public int addNumbers(String[] numbers)
    {
        return Stream.of(numbers).mapToInt(Integer::parseInt).sum();
    }

    /**
     * throw exception if any of the numbers found negative
     * @param addednums
     */
    private void throwsExceptionIfAtLeastOneNegative(String[] addednums) {
        String negatives = Stream.of(addednums)
                .filter(addendum -> Integer.parseInt(addendum) < 0)
                .collect(Collectors.joining(", "));

        if (!negatives.isEmpty())
            throw new IllegalArgumentException("negatives not allowed: " + negatives);
    }
}
