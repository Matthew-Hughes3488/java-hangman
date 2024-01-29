package game;

import utils.InputManager;
import utils.InputProvider;
import utils.OutputManager;
import utils.OutputProvider;

public class GameLauncher {

    private GameSettingsManager gameSettings;
    private final OutputProvider gameOutputProvider;
    private final OutputProvider settingsOutputProvider;
    private final InputProvider inputProvider;

    public GameLauncher(OutputProvider settingsOutputProvider, OutputProvider gameOutputProvider, InputProvider inputProvider, GameSettingsManager gameSettings) {
        this.inputProvider = inputProvider;
        this.gameOutputProvider = gameOutputProvider;
        this.settingsOutputProvider = settingsOutputProvider;
        this.gameSettings = gameSettings;
        onLaunch();
    }

    public void onLaunch(){
        gameOutputProvider.printGameLaunchMessage();
        gameOutputProvider.printDifficultyMessage();
        mainLoop();
    }
    private void mainLoop(){
        gameOutputProvider.printCommands();
        int userInput = inputProvider.getIntegerInput(0, gameOutputProvider.getNumCommands() - 1);

        switch (userInput){
            case 0:
                startNewGame();
                break;
            case 1:
                changeSettings();
                break;
            case 2:
                return;
        }

        mainLoop();
    }

    private void startNewGame(){
        GameManager game = new GameManager(gameSettings.getNumberOfTries());
        if(game.startGame()) startNewGame();
    }

    private void changeSettings(){
        settingsOutputProvider.printCommands();
        int userInput = inputProvider.getIntegerInput(0, settingsOutputProvider.getNumCommands() - 1);

        switch (userInput){
            case 0:
                gameSettings.setDifficulty("easy");
                break;
            case 1:
                gameSettings.setDifficulty("medium");
                break;
            case 2:
                gameSettings.setDifficulty("hard");
                break;
            case 4:
                break;
        }
    }
}
