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

    private int guessedChars;

    public GameWord(){
        word = WordGenerator.getRandomWord();
        wordArr = initializeWordArray();
        guessedChars = 0;
    }

    public String getWord() {
        return word;
    }

    private List<WordNode> initializeWordArray(){
        List<WordNode> arr = new ArrayList<>();
        for(char ch : word.toCharArray()){
            arr.add(new WordNode(ch));
        }
        return arr;
    }

    public boolean gameWordContains(char ch){
        for(WordNode node : wordArr){
            if(node.getCharacter() == ch) {
                updateWordArr(ch);
                return true;
            }
        }
        return false;
    }
    public boolean wordGuessed(){
        return guessedChars == word.length();
    }

    private void updateWordArr(char ch){
        for (var node: wordArr){
            if(node.getCharacter() == ch){
                node.setGuessed(true);
                guessedChars++;
            }
        }
    }
}
