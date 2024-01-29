package game;

public interface WordProvider {
    String getWord();
    boolean gameWordContains(char ch);
    boolean checkFullWordGuess(String str);
    boolean wordGuessed();
}
