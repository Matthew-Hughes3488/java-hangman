package game;

import utils.WordGenerator;
import java.util.*;
/**
 * The GameWord class represents a word in the game, providing methods to manipulate and check its state.
 */
public class GameWord implements WordProvider {
    /**
     * Represents a node in the word, containing a character and its guessed status.
     */
    private static class WordNode{
        private final char character;
        private boolean guessed;
        /**
         * Constructs a WordNode with the given character.
         *
         * @param character The character of the node.
         */
        private WordNode(char character){
            this.character = character;
            guessed = false;
        }
        /**
         * Gets the character of the node.
         *
         * @return The character of the node.
         */
        public char getCharacter() {
            return character;
        }
        /**
         * Checks if the node's character has been guessed.
         *
         * @return true if the character has been guessed, false otherwise.
         */
        public boolean isGuessed() {
            return guessed;
        }
        /**
         * Sets the guessed status of the node.
         *
         * @param guessed The guessed status to set.
         */
        public void setGuessed(boolean guessed) {
            this.guessed = guessed;
        }

    }
    private final String word;
    private final List<WordNode> wordArr;
    private int correctlyGuessedChars;
    /**
     * Constructs a GameWord object with a randomly generated word.
     */
    public GameWord(){
        word = WordGenerator.getRandomWord();
        wordArr = initializeWordArray();
        correctlyGuessedChars = 0;
    }
    /**
     * Gets the word.
     *
     * @return The word.
     */
    @Override
    public String getWord() {
        return word;
    }
    /**
     * Checks if the word contains a given character.
     *
     * @param ch The character to check.
     * @return true if the word contains the character, false otherwise.
     */
    @Override
    public boolean gameWordContains(char ch){
        ch = Character.toLowerCase(ch);

        for(WordNode node : wordArr){
            if(Character.toLowerCase(node.getCharacter()) == ch) {
                updateWordArr(ch);
                return true;
            }
        }
        return false;
    }
    /**
     * Checks if a full word guess matches the game word.
     *
     * @param str The word guess.
     * @return true if the guess matches the word, false otherwise.
     */
    @Override
    public boolean checkFullWordGuess(String str){
        if(str.toLowerCase().equals(word.toLowerCase())){
            setNodesToTrue();
            correctlyGuessedChars = word.length();
            return true;
        }
        return false;
    }
    /**
     * Checks if the entire word has been guessed.
     *
     * @return true if the word has been fully guessed, false otherwise.
     */
    @Override
    public boolean wordGuessed(){
        return correctlyGuessedChars == word.length();
    }
    /**
     * Initializes the word array with nodes for each character of the word.
     *
     * @return The list of WordNode objects.
     */
    private List<WordNode> initializeWordArray(){
        List<WordNode> arr = new ArrayList<>();
        for(char ch : word.toCharArray()){
            arr.add(new WordNode(ch));
        }
        return arr;
    }
    /**
     * Updates the word array to mark guessed characters.
     *
     * @param ch The guessed character.
     */
    private void updateWordArr(char ch){
        ch = Character.toLowerCase(ch);

        for (var node: wordArr){
            if(Character.toLowerCase(node.getCharacter()) == ch){
                node.setGuessed(true);
                correctlyGuessedChars++;
            }
        }
    }
    /**
     * Sets all nodes of the word to guessed.
     */
    private void setNodesToTrue(){
        for (WordNode node : wordArr){
            node.setGuessed(true);
        }
    }
    /**
     * Returns a string representation of the word, with guessed characters revealed and unguessed characters as underscores.
     *
     * @return The string representation of the word.
     */
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (WordNode node : wordArr){
            if(node.isGuessed()) output.append(node.getCharacter());
            else output.append('_');
        }

        return output.toString();
    }
}
