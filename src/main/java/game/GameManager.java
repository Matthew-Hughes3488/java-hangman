package game;

import utils.*;

public class GameManager {
    private final WordProvider gameWord;
    private final GameStateManager stateManager;
    private final GuessHandler guessHandler;
    private final InputProvider inputProvider;
    private final OutputProvider outputProvider;
    /**
     * Constructs a GameManager object with the specified number of lives.
     *
     * @param numberOfLives The number of lives for the player.
     */
    public GameManager(int numberOfLives) {
        gameWord = new GameWord();
        stateManager = new GameStateHandler(numberOfLives);
        guessHandler = new GuessHandler(gameWord);
        inputProvider = new InputManager();
        outputProvider = new OutputManager();
    }
    /**
     * Starts the hangman game.
     *
     * @return True if the game was won, false otherwise.
     */
    public boolean startGame() {
        stateManager.setGameStarted();
        outputProvider.printGameStart();
        return gameLoop();
    }
    /**
     * Executes the main game loop.
     *
     * @return True if the game was won, false otherwise.
     */
    private boolean gameLoop() {
        while (!stateManager.isGameFinished()) {
            outputProvider.printWordSoFar(gameWord);
            outputProvider.printNumGuessesLeft(stateManager.getLivesRemaining());
            outputProvider.printNextGuessMessage();

            String userGuess = inputProvider.getStringInput();
            if (!guessHandler.processGuess(userGuess))
                stateManager.removeLife();

            if (gameWord.wordGuessed()) {
                stateManager.setGameFinished();
                stateManager.setGameWon();
                break;
            }

        }
        return endGame();
    }

    /**
     * Handles the end of the game.
     *
     * @return True if the player wants to play again, false otherwise.
     */
    private boolean endGame() {
        outputProvider.printWordSoFar(gameWord);
        if (stateManager.isGameWon()) outputProvider.printWinMessage();
        else outputProvider.printLoseMessage();

        return inputProvider.getIntegerInput(0, 1) == 0;
    }
}
