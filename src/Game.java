/**
 * Created by junkyu on 2017. 5. 10..
 */
public class Game {
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        // roll은 몇개를 굴렸는지만 기록해야함, score 계산하는거 아님,
        rolls[currentRoll++] = pins;
        // refactoring 중간에도 테스트가 깨지지 않고 고치는게 중요함
    }

    public int score() {
        int score = 0;
        int frameIndex = 0; // i 이런 의미없는 이름 별로다..
        for(int frame = 0; frame < 10; frame++){
            if(isSpare(frameIndex)) // spare
            {
                score += 10 + rolls[frameIndex+2];
                frameIndex += 2;
            }else{
                score += rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex += 2;
            }
        }
        return score;
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1] == 10;
    }
}
