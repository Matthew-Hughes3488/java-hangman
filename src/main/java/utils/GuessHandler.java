package utils;
import game.WordProvider;
import java.util.HashSet;
import java.util.Set;
/**
 * The GuessHandler class manages the processing of guesses in the game.
 */
public class GuessHandler {
    private final WordProvider gameWord;
    private final Set<Character> guessedChars;
    /**
     * Constructs a GuessHandler with the specified game word provider.
     *
     * @param gameWord The game word provider.
     */
    public GuessHandler(WordProvider gameWord){
        this.gameWord = gameWord;
        guessedChars = new HashSet<>();
    }
    /**
     * Processes a guess.
     *
     * @param guess The guess to process.
     * @return true if the guess is correct, false otherwise.
     */
    public boolean processGuess(String guess){
        if(guess.length() !=1){
            return gameWord.checkFullWordGuess(guess);
        }

        char guessedChar = guess.charAt(0);

        if(alreadyGuessed(guessedChar)) return false;
        return gameWord.gameWordContains(guessedChar);
    }
    /**
     * Checks if a character has already been guessed.
     *
     * @param guess The character to check.
     * @return true if the character has already been guessed, false otherwise.
     */
    private boolean alreadyGuessed(char guess){
        return !guessedChars.add(guess);
    }
}
