package utils;

import java.util.Set;

public class GuessHandler {
    //Store the current word being used in the game
    private String word;
    //store all guess
    private Set<String> guessedChars;
    //store how much of the word they have got so far
    private int correctGuesses;
    //check if the guess has already been made
    private boolean alreadyGuessed(String guess){
        return !guessedChars.add(guess);
    }
    //check if word contain the guess
    //check if the word has been successfully guessed
    private boolean wordGuessed(){
        return word.length() == correctGuesses;
    }
}
