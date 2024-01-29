package game;

import utils.*;

public class GameManager {
    private final WordProvider gameWord;
    private final GameStateManager stateManager;
    private final GuessHandler guessHandler;
    private final InputProvider inputProvider;
    private final OutputProvider outputProvider;

    public GameManager(int numberOfLives) {
        gameWord = new GameWord();
        stateManager = new GameStateHandler(numberOfLives);
        guessHandler = new GuessHandler(gameWord);
        inputProvider = new InputManager();
        outputProvider = new OutputManager();
    }

    public boolean startGame() {
        stateManager.setGameStarted();
        outputProvider.printGameStart();
        return gameLoop();
    }

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


    private boolean endGame() {
        outputProvider.printWordSoFar(gameWord);
        if (stateManager.isGameWon()) outputProvider.printWinMessage();
        else outputProvider.printLoseMessage();

        return inputProvider.getIntegerInput(0, 1) == 0;
    }
}
