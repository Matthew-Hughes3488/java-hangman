package utils;

public interface OutputProvider {
    void printGameOverMessage();
    void printWordSoFar(GameWord word);
    void printNextGuessMessage();
    void printNumGuessesLeft(int guessesLeft);
}

