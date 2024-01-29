package game;

public interface GameStateManager {
    boolean isGameStarted();
    void setGameStarted();
    boolean isGameFinished();
    void setGameFinished();
    boolean isGameWon();
    void setGameWon();
    int getLivesRemaining();
    void removeLife();



}
