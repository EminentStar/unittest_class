/**
 * Created by junkyu on 2017. 5. 10..
 */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {
    private Game g;

    @BeforeEach
    public void setUp(){
        g = new Game();
    }

    @Test
    public void testGutterGame(){ // 제일 쉬운 전부다 0개 치는거부터 만들자
        rollMany(0, 20);
        assertEquals(0, g.score());
    }

    private void rollMany(int pins, int n) {
        for(int i = 0; i < n; i++){
            g.roll(pins);
        }
    }

    @Test
    public void testAllOnes(){ // 제일 쉬운 전부다 0개 치는거부터 만들자
        rollMany(1, 20);
        assertEquals(20, g.score());
    }

}
