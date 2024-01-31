package game;
/**
 * The GameStateManager interface defines methods for managing the state of the game.
 * Implementing classes should provide functionality to determine if the game has started,
 * finished, or if the player has won, as well as methods for accessing the number of lives remaining.
 */
public interface GameStateManager {
    /**
     * Checks if the game has started.
     *
     * @return true if the game has started, false otherwise.
     */
    boolean isGameStarted();
    /**
     * Sets the game started state to true.
     */
    void setGameStarted();
    /**
     * Checks if the game has finished.
     *
     * @return true if the game has finished, false otherwise.
     */
    boolean isGameFinished();
    /**
     * Sets the game finished state to true.
     */
    void setGameFinished();
    /**
     * Checks if the game has been won.
     *
     * @return true if the game has been won, false otherwise.
     */
    boolean isGameWon();
    /**
     * Sets the game won state to true.
     */
    void setGameWon();
    /**
     * Retrieves the number of lives remaining.
     *
     * @return The number of lives remaining.
     */
    int getLivesRemaining();
    /**
     * Removes a life from the player's remaining lives.
     */
    void removeLife();
}
