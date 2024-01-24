package utils;

import java.util.*;

public class GameWord {

    private static class WordNode{
        private final char character;
        private boolean guessed;

        public WordNode(char character){
            this.character = character;
            guessed = false;
        }

        public char getCharacter() {
            return character;
        }

        public boolean isGuessed() {
            return guessed;
        }

        public void setGuessed(boolean guessed) {
            this.guessed = guessed;
        }
    }
    private final String  word;
    private final List<WordNode> wordArr;

    public GameWord(){
        word = WordGenerator.getRandomWord();
        wordArr = initializeWordArray();
    }

    public String getWord() {
        return word;
    }

    public List<WordNode> getWordArr() {
        return wordArr;
    }

    private List<WordNode> initializeWordArray(){
        List<WordNode> arr = new ArrayList<>();
        for(char ch : word.toCharArray()){
            arr.add(new WordNode(ch));
        }
        return arr;
    }
}
