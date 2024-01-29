import game.GameLauncher;
import game.GameSettings;
import utils.InputManager;
import utils.OutputManager;

public class Testing {
    public static void main(String[] args) {
        String[] commands1 = {"Easy", "Medium", "Hard", "Go back"};
        String[] commands2 = {"Start new game", "Change difficulty", "Quit"};

        OutputManager gameOutputManager = new OutputManager(commands1);
        OutputManager settingsOutputManager = new OutputManager(commands2);
        InputManager inputManager = new InputManager();
        GameSettings gameSettings = new GameSettings("easy");

        GameLauncher gameLauncher = new GameLauncher(gameOutputManager, settingsOutputManager, inputManager, gameSettings);
    }
}
