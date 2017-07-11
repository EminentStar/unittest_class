package com.company;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by junkyu on 2017. 7. 11..
 */
public class TestCalculateAll {
    public static Test suite(){
        TestSuite suite = new TestSuite("Test Calculates All");
        suite.addTest(new TestCalculateSample(
                "testGetAverage"));
        suite.addTest(new TestCalculateSample("testGetSum"));

        return suite;
    }
}
