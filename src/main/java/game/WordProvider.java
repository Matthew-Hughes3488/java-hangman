package game;
/**
 * The WordProvider interface defines methods for providing and manipulating game words.
 */
public interface WordProvider {
    /**
     * Gets the game word.
     *
     * @return The game word as a string.
     */
    String getWord();
    /**
     * Checks if the game word contains the specified character.
     *
     * @param ch The character to check.
     * @return true if the game word contains the character, false otherwise.
     */
    boolean gameWordContains(char ch);
    /**
     * Checks if a full word guess matches the game word.
     *
     * @param str The word guess.
     * @return true if the guess matches the game word, false otherwise.
     */
    boolean checkFullWordGuess(String str);
    /**
     * Checks if the entire game word has been guessed.
     *
     * @return true if the game word has been fully guessed, false otherwise.
     */
    boolean wordGuessed();
}
