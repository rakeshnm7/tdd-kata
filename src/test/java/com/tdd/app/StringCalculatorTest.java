package com.tdd.app;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Rakesh.Kumar on 02-02-2021.
 **/


public class StringCalculatorTest {

    private StringCalculator stringCalculator;


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
    public void for2NumbersSeparatedByComma()
    {
        assertEquals(6, stringCalculator.add("2,4"));
    }

    @Test
    public void for5NumbersSeparatedByComma()
    {
        assertEquals(15, stringCalculator.add("1,2,3,4,5"));
    }


}
