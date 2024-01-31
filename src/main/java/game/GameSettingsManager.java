package game;
/**
 * The GameSettingsManager interface defines methods for managing game settings such as difficulty level and number of tries.
 */
public interface GameSettingsManager {
    /**
     * Sets the difficulty level of the game.
     *
     * @param difficulty The new difficulty level to set.
     */
    void setDifficulty(String difficulty);
    /**
     * Gets the number of tries allowed based on the current difficulty level.
     *
     * @return The number of tries allowed for the current difficulty level.
     */
    int getNumberOfTries();
}
