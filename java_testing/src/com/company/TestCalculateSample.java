package com.company;

import junit.framework.TestCase;

/**
 * Created by junkyu on 2017. 7. 11..
 */
public class TestCalculateSample extends TestCase {
    public TestCalculateSample(String methodName){
        super(methodName);
    }
    CalculateSample cs;

    public void setUp() throws Exception {
        super.setUp();
        cs = new CalculateSample(10, 5);
    }

    public void testGetSum(){
        int result = cs.getSum();
        assertEquals(15, result);
    }

    public void testGetAverage(){
        double result = cs.getAverage();
        assertEquals(7.5, result);
    }

    public void testGetMultiply(){
        int result = cs.getMultiply();
        assertEquals(50, result);
    }

    public void testGetDivide() throws Exception {
        double result = cs.getDivide();
        assertEquals(2.0, result);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
