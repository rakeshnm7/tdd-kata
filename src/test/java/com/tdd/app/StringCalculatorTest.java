package com.tdd.app;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rakesh.Kumar on 02-02-2021.
 **/


public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setup()
    {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void forNullStringReturns0()
    {
        assertEquals(0, stringCalculator.add(null));
    }

    @Test
    public void forEmptyStringReturns0()
    {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void forSingleNumberReturnsSameNumber()
    {
        assertEquals(10, stringCalculator.add("10"));
    }

    @Test
    public void for2NumbersSeparatedByComma()
    {
        assertEquals(6, stringCalculator.add("2,4"));
    }

    @Test
    public void for5NumbersSeparatedByComma()
    {
        assertEquals(15, stringCalculator.add("1,2,3,4,5"));
    }

    @Test
    public void forSupportingNewLines()
    {
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void forSupportingDifferentDelimiters()
    {
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    @Test
    public void forNegativeNumbersThrowsException()
    {

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("negatives not allowed: -4");

        stringCalculator.add("0,1,2,3,-4,5");
    }


}
