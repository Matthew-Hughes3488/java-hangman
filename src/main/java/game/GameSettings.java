package game;

import java.util.HashMap;
import java.util.Map;

public class GameSettings implements GameSettingsManager{
    private String difficulty;
    private final Map<String, Integer> numberOfTries;
    /**
     * Constructs a GameSettings object with the specified difficulty level.
     *
     * @param difficulty The difficulty level of the game.
     */
    public GameSettings(String difficulty){
        this.difficulty = difficulty;
        this.numberOfTries = initializeMap();
    }
    /**
     * Sets the difficulty level of the game.
     *
     * @param difficulty The new difficulty level to set.
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    /**
     * Gets the number of tries based on the current difficulty level.
     *
     * @return The number of tries allowed for the current difficulty level.
     */
    public int getNumberOfTries(){
        return numberOfTries.get(difficulty);
    }
    /**
     * Initializes the map containing difficulty levels and corresponding number of tries.
     *
     * @return A map containing difficulty levels as keys and number of tries as values.
     */
    private Map<String, Integer> initializeMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("easy", 8);
        map.put("medium", 5);
        map.put("hard", 3);
        return map;
    }
}
