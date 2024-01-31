package game;

import utils.InputManager;
import utils.InputProvider;
import utils.OutputManager;
import utils.OutputProvider;

public class GameLauncher {

    private final GameSettingsManager gameSettings;
    private final OutputProvider gameOutputProvider;
    private final OutputProvider settingsOutputProvider;
    private final InputProvider inputProvider;

    /**
     * Constructs a GameLauncher object with the specified output providers,
     * input provider, and game settings manager.
     *
     * @param settingsOutputProvider The output provider for settings-related messages.
     * @param gameOutputProvider     The output provider for game-related messages.
     * @param inputProvider          The input provider for user input.
     * @param gameSettings           The game settings manager.
     */
    public GameLauncher(OutputProvider settingsOutputProvider, OutputProvider gameOutputProvider, InputProvider inputProvider, GameSettingsManager gameSettings) {
        this.inputProvider = inputProvider;
        this.gameOutputProvider = gameOutputProvider;
        this.settingsOutputProvider = settingsOutputProvider;
        this.gameSettings = gameSettings;
        onLaunch();
    }
    /**
     * Launches the game by printing the game launch message and difficulty message,
     * and entering the main loop.
     */
    public void onLaunch(){
        gameOutputProvider.printGameLaunchMessage();
        gameOutputProvider.printDifficultyMessage();
        mainLoop();
    }
    /**
     * Enters the main loop of the game, handling user input and executing game actions
     * based on the input.
     */
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
    /**
     * Starts a new game by creating a GameManager object with the specified number
     * of tries from the game settings, and starting the game.
     */
    private void startNewGame(){
        GameManager game = new GameManager(gameSettings.getNumberOfTries());
        if(game.startGame()) startNewGame();
    }
    /**
     * Changes the game settings based on user input.
     */
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
