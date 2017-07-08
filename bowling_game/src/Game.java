/**
 * Created by junkyu on 2017. 7. 8..
 */
public class Game {
    private int score = 0;
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        /**
         * This method is called each time the player rolls a ball.
         * The argument is the number of pins knocked down.
         * */
        score += pins;
        rolls[currentRoll++] = pins;
    }

    public int score() {
        /**
         * This method is called only at the very end of the game.
         * It returns the total score for that game.
         * */
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++){
            if(isStrike(frameIndex)){ // strike
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            }else if(isSpare(frameIndex)){
                score += 10 + rolls[frameIndex+2];
                frameIndex += 2;
            }else {
                score += rolls[frameIndex] + rolls[frameIndex+1];
                frameIndex += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] +
                rolls[frameIndex+1] == 10;
    }
}