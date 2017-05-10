/**
 * Created by junkyu on 2017. 5. 10..
 */
public class Game {
    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
