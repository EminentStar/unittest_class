package com.company;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by junkyu on 2017. 7. 11..
 */
public class TestCalculateSampleJUnit4{
    CalculateSample sample;

    @Before
    public void setNumbers() throws Exception {
        sample = new CalculateSample(1, 0);
    }

    @Test
    public void getSum(){
        assertEquals(1, sample.getSum());
    }

    @Test
    public void getAverage(){
        assertEquals(0.5, sample.getAverage());
    }

    @Test
    public void testGetMultiply(){
        assertEquals(0, sample.getMultiply(), 1);
    }

    @Test(expected = ArithmeticException.class)
    public void getDivide() throws Exception {
        assertEquals(0, sample.getDivide(), 0.1);
    }

    @After
    public void releaseClass(){
        sample=null;
    }
}
