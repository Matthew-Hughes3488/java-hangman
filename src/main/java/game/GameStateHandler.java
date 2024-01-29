package game;

public class GameStateHandler implements GameStateManager {
    private boolean gameStarted;
    private boolean gameFinished;
    private boolean gameWon;

    private int livesRemaining;

    public GameStateHandler(int numberOfLives) {
        this.gameStarted = false;
        this.gameFinished = false;
        this.gameWon = false;
        this.livesRemaining = numberOfLives;
    }

    private void isPlayerDead(){
        if(livesRemaining == 0){
            gameFinished = true;
        }
    }
    @Override
    public boolean isGameStarted() {
        return gameStarted;
    }

    @Override
    public void setGameStarted() {
        this.gameStarted = true;
    }

    @Override
    public boolean isGameFinished() {
        return gameFinished;
    }

    @Override
    public void setGameFinished() {
        this.gameFinished = true;
    }

    @Override
    public boolean isGameWon() {
        return gameWon;
    }

    @Override
    public void setGameWon() {
        this.gameWon = true;
    }

    @Override
    public int getLivesRemaining() {
        return livesRemaining;
    }

    @Override
    public void removeLife() {
        this.livesRemaining = livesRemaining - 1;
        isPlayerDead();
    }
}
