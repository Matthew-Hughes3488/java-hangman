package utils;

public interface OutputProvider {
    void printGameStart();
    void printWinMessage();
    void printLoseMessage();
    void printWordSoFar(GameWord word);
    void printNextGuessMessage();
    void printNumGuessesLeft(int guessesLeft);
}

