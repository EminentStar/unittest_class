import org.junit.*;

import java.util.Collections;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

/**
 * Created by junkyu on 2017. 7. 8..
 */
public class HelloWorldUnitTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("=================================================");
        System.out.println("|| Executed once before the start of all tests.||");
        System.out.println("=================================================");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("======================================================");
        System.out.println("|| Executed once after all tests have been finished.||");
        System.out.println("======================================================");
    }

    @Before
    public void before(){
        /**
         * !!
         * */
        System.out.println("------------------------------");
        System.out.println("| Executed before each test. |");
        System.out.println("------------------------------");
    }

    @After
    public void after(){
        System.out.println("------------------------------");
        System.out.println("| Executed after each test. |");
        System.out.println("------------------------------");
    }

    @Before
    public void anotherBefore(){
        /**
         * Execution order of similar annotated methods is not guaranteed.
         * */
        System.out.println("---------------------------------------------");
        System.out.println("| Another method executed before each test. |");
        System.out.println("---------------------------------------------");
    }

    @Test
    public void testHelloWorld() {
        String helloWorld = "Hello" + " World!";
        assertEquals("Hello World!", helloWorld);
    }

    @Test
    public void test(){
        System.out.println("This is a test that is expected to pass normally.");
    }

    @Test(expected = Exception.class)
    public void testException(){
        System.out.println("This test is exepcted to pass if an Exception occurs.");
        int i = 0 / 0;
    }

    @Test(timeout = 1000)
    public void testTimeout() throws Exception {
        System.out.println("This test is expected to pass if it executed faster than 1000ms.");
        Thread.sleep(100);
    }

    @Test
    @Ignore
    public void testIgnore() throws Exception {
        System.out.println("This test is ignored and will not be executed.");
    }

    @Test
    public void testBooleanAssertions(){
        /**
         * Best Practice: Use just one assertion per test!
         */

        assertTrue(true); //pass
        //assertFalse(1 == 1); // Fail
        assertFalse(false); // Would pass but isn't executed due to previous
        // failure of assertFalse(1 == 1)
    }

    @Test
    public void testEqualsComparisonAssertions(){
        assertEquals(100L, 100L); // Pass
        assertEquals(0, Collections.emptyList().size());
        // assertEquals("Expected Result", "Actural Result"); // Fail
    }

    @Test
    public void testSameComparisonAssertions(){
        Object o1 = new Object();
        Object o2 = o1;
        assertSame(o1, o2); //Pass
        assertNotSame(o1, new Object()); // Pass
        // assertSame(o2, new Object()); // Fail
    }

    @Test
    public void testNullComparisonAssertions(){
        assertNull(null); // Pass
        Object o = null;
        assertNull(o); // Pass
        // assertNotNull(o); // Fail
    }

    @Test
    public void testAssertionsWithMessages(){
        assertTrue(true);
        assertTrue("This should pass so this text will never shop up anywhere", true);
        // assertTrue("As this test fails this message will be displayed.", false);
    }

    /**
     * # Asserts
     * - assertArrayEquals
     * - assertEquals(double expected, doule actual, double delta);
     * - assertEquals
     * - assertTrue
     * - assertFalse
     * - assertNull
     * - assertNotNull
     * - assertNotSame
     * - assertThat
     * - fail
     * */




}