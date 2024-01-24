package utils;

public class ScoreManager {
    private int score;

    public int getScore() {
        return score;
    }

    public void incrementScore(){
        score++;
    }

    public void decrementScore(){
        score = Math.max(score - 1, 0);
    }
}
