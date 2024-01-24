import utils.GameWord;
import utils.InputManager;
import utils.InputValidator;
import utils.WordGenerator;

public class Testing {
    public static void main(String[] args) {

        GameWord word = new GameWord();
        System.out.println(WordGenerator.getRandomWord());
    }
}
