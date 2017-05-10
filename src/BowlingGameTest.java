/**
 * Created by junkyu on 2017. 5. 10..
 */

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {
    private Game g;

    @BeforeEach
    public void setUp(){
        g = new Game();
    }

    // 테스트와 관련없는 건 위로 정리해두는게 좋음
    private void rollMany(int pins, int n) {
        for(int i = 0; i < n; i++){
            g.roll(pins);
        }
    }
    private void rollSpare() {
        g.roll(5);
        g.roll(5); // spare
    }

    private void rollStrike() {
        g.roll(10);
    }

    @Test
    public void testGutterGame(){ // 제일 쉬운 전부다 0개 치는거부터 만들자
        rollMany(0, 20);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes(){ // 제일 쉬운 전부다 0개 치는거부터 만들자
        rollMany(1, 20);
        assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare(){ // 제일 쉬운 전부다 0개 치는거부터 만들자
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertEquals(16, g.score());
    }

    @Test
    public void testOneStrike(){ // 제일 쉬운 전부다 0개 치는거부터 만들자
        rollStrike(); //strike
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());
    }


}
