import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by junkyu on 2017. 7. 8..
 * Take a large set of test data, including an expected result
 * Define a test that uses the test data
 * Verify calcuated result against expected result
 */

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private final double income;
    private final double expectedTax;
    private final double precision;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0.0, 0.0, 3.0},
                {14.0, 2.0, 4.0}
        });
    }

    public ParameterizedTest(double income, double expectedTax, double precision){
        this.income = income;
        this.expectedTax = expectedTax;
        this.precision = precision;
    }

    @Test
    public void paramTest(){
        assertEquals(income, expectedTax, precision);

    }
}
