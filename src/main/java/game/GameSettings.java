package game;

import java.util.HashMap;
import java.util.Map;

public class GameSettings implements GameSettingsManager{
    private String difficulty;
    private final Map<String, Integer> numberOfTries;
    public GameSettings(String difficulty){
        this.difficulty = difficulty;
        this.numberOfTries = initializeMap();
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public int getNumberOfTries(){
        return numberOfTries.get(difficulty);
    }
    private Map<String, Integer> initializeMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("easy", 8);
        map.put("medium", 5);
        map.put("hard", 3);
        return map;
    }
}
