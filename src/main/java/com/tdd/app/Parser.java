package com.tdd.app;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

            if (numbers.contains("[") || numbers.contains("]"))
            {
                List<String> delimiters = new ArrayList<>();
                Pattern regex = Pattern.compile("\\[(.*?)\\]");
                Matcher regexMatcher = regex.matcher(numbers);

                while (regexMatcher.find()) {//Finds Matching Pattern in String
                    delimiters.add(regexMatcher.group(1));//Fetching Group from String
                }
                numbers = numbers.substring(numbers.indexOf("\n")+1);

                for (String delimiter: delimiters)
                {
                    numbers = numbers.replace(delimiter,",");
                }
                return numbers.split(",");
            }

            numbers = numbers.substring(numbers.indexOf("\n")+1);
            return numbers.split(customDelimiter);
        }
        numbers = numbers.replace(defaultDelimiters[0], " ").
                replace(defaultDelimiters[1], " ");
        return numbers.split(" ");
    }
}
