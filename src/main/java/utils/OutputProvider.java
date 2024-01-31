package utils;
import game.WordProvider;
/**
 * Interface for providing output functionalities in the game.
 */
public interface OutputProvider {
    /**
     * Prints available commands to the output.
     */
    void printCommands();
    /**
     * Prints the game launch message to the output.
     */
    void printGameLaunchMessage();
    /**
     * Prints the game start message to the output.
     */
    void printGameStart();
    /**
     * Prints the win message to the output.
     */
    void printWinMessage();
    /**
     * Prints the lose message to the output.
     */
    void printLoseMessage();
    /**
     * Prints the current state of the word to the output.
     *
     * @param word the WordProvider representing the word to be printed
     */
    void printWordSoFar(WordProvider word);
    /**
     * Prints the next guess message to the output.
     */
    void printNextGuessMessage();
    /**
     * Prints the number of guesses left to the output.
     *
     * @param guessesLeft the number of guesses left
     */
    void printNumGuessesLeft(int guessesLeft);
    /**
     * Retrieves the number of commands available.
     *
     * @return the number of commands available
     */
    int getNumCommands();
    /**
     * Prints the difficulty message to the output.
     */
    void printDifficultyMessage();
}

