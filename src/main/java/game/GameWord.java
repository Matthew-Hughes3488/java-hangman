package game;

import utils.WordGenerator;
import java.util.*;

public class GameWord implements WordProvider {

    private static class WordNode{
        private final char character;
        private boolean guessed;

        private WordNode(char character){
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
    private final String word;
    private final List<WordNode> wordArr;
    private int correctlyGuessedChars;

    public GameWord(){
        word = WordGenerator.getRandomWord();
        wordArr = initializeWordArray();
        correctlyGuessedChars = 0;
    }
    public String getWord() {
        return word;
    }

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

    public boolean checkFullWordGuess(String str){
        if(str.toLowerCase().equals(word.toLowerCase())){
            setNodesToTrue();
            correctlyGuessedChars = word.length();
            return true;
        }
        return false;
    }
    public boolean wordGuessed(){
        return correctlyGuessedChars == word.length();
    }
    private List<WordNode> initializeWordArray(){
        List<WordNode> arr = new ArrayList<>();
        for(char ch : word.toCharArray()){
            arr.add(new WordNode(ch));
        }
        return arr;
    }
    private void updateWordArr(char ch){
        ch = Character.toLowerCase(ch);

        for (var node: wordArr){
            if(Character.toLowerCase(node.getCharacter()) == ch){
                node.setGuessed(true);
                correctlyGuessedChars++;
            }
        }
    }

    private void setNodesToTrue(){
        for (WordNode node : wordArr){
            node.setGuessed(true);
        }
    }
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
