package utils;
import game.WordProvider;
import java.util.HashSet;
import java.util.Set;

public class GuessHandler {
    private final WordProvider gameWord;
    private final Set<Character> guessedChars;

    public GuessHandler(WordProvider gameWord){
        this.gameWord = gameWord;
        guessedChars = new HashSet<>();
    }

    public boolean processGuess(String guess){
        if(guess.length() !=1){
            return gameWord.checkFullWordGuess(guess);
        }

        char guessedChar = guess.charAt(0);

        if(alreadyGuessed(guessedChar)) return false;
        return gameWord.gameWordContains(guessedChar);
    }

    private boolean alreadyGuessed(char guess){
        return !guessedChars.add(guess);
    }
}
