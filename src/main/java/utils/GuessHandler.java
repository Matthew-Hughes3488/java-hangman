package utils;

import java.util.HashSet;
import java.util.Set;

public class GuessHandler {
    private final GameWord gameWord;
    private final Set<Character> guessedChars;

    public GuessHandler(GameWord gameWord){
        this.gameWord = gameWord;
        guessedChars = new HashSet<>();
    }

    private boolean alreadyGuessed(char guess){
        return !guessedChars.add(guess);
    }

    public boolean validateGuess(char guess){
        if(alreadyGuessed(guess)) return false;
        return gameWord.gameWordContains(guess);
    }
}
