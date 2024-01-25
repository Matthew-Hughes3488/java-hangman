package utils;

public interface OutputProvider {

    void printCommands();
    void printGameLaunchMessage();
    void printGameStart();
    void printWinMessage();
    void printLoseMessage();
    void printWordSoFar(GameWord word);
    void printNextGuessMessage();
    void printNumGuessesLeft(int guessesLeft);
    int getNumCommands();
    void printDifficultyMessage();
}

