import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by junkyu on 2017. 7. 8..
 */
public class BowlingGameTest {
    private Game g;

    @Before
    public void setUp(){
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i=0; i<n; i++){
            g.roll(pins);
        }
    }

    @Test
    public void testGutterGame(){
        /**
         * Gutter란 lane의 양옆에 있는 또랑을 말함 무조건 0점이라고 보면 됨.
         * */
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes(){
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare(){
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertEquals(16, g.score());
    }

    @Test
    public void testOneStrike(){
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());
    }

    @Test
    public void testTwoStrikes(){
        rollStrike();
        rollStrike();
        rollMany(16, 0);
        assertEquals(30, g.score());
    }

    @Test
    public void testPerfectGame(){
        rollMany(12, 10);
        assertEquals(300, g.score());
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    private void rollStrike() {
        g.roll(10);
    }
}
