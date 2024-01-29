package utils;
import game.WordProvider;

public interface OutputProvider {

    void printCommands();
    void printGameLaunchMessage();
    void printGameStart();
    void printWinMessage();
    void printLoseMessage();
    void printWordSoFar(WordProvider word);
    void printNextGuessMessage();
    void printNumGuessesLeft(int guessesLeft);
    int getNumCommands();
    void printDifficultyMessage();
}

