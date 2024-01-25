package utils;

public interface OutputProvider {
    void printGameStart();
    void printGameOverMessage();
    void printWordSoFar(GameWord word);
    void printNextGuessMessage();
    void printNumGuessesLeft(int guessesLeft);
}

