import utils.InputManager;
import utils.InputValidator;

public class Testing {
    public static void main(String[] args) {

        InputManager input = new InputManager();
        String str = input.getStringInput();

        System.out.println(str);
    }
}
