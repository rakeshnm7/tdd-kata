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

}
