package utils;
import game.WordProvider;
/**
 * The OutputManager class implements the OutputProvider interface and provides methods for displaying game output.
 */
public class OutputManager implements OutputProvider {

    private String[] commands;
    /**
     * Constructs a new OutputManager object without commands.
     */
    public OutputManager(){
    }
    /**
     * Constructs a new OutputManager object with the specified commands.
     *
     * @param commands The array of commands to be displayed.
     */
    public OutputManager(String[] commands){
        this.commands = commands;
    }
    /**
     * Prints available commands to the console.
     */
    @Override
    public void printCommands() {
        if(commands == null){
            System.out.println("No commands available");
            return;
        }

        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < commands.length; i++) {
            stringBuffer.append(String.format("%d: %s\n", i, commands[i]));
        }
        System.out.println("Please enter a command");
        System.out.println(stringBuffer.toString());
    }
    /**
     * Prints the game launch message to the console.
     */
    @Override
    public void printGameLaunchMessage() {
        System.out.println("Welcome to Matts hangman game");
        System.out.println("Predictably, it has a wizard in it :)");
    }
    /**
     * Prints the game start message to the console.
     */
    @Override
    public void printGameStart() {
        System.out.println("The game has begun");
    }
    /**
     * Prints the win message to the console.
     */
    @Override
    public void printWinMessage() {
        System.out.println("You win :)");
        System.out.println("Play again?");
        System.out.println("0: Yes\n1: No");
    }
    /**
     * Prints the lose message to the console.
     */
    @Override
    public void printLoseMessage() {
        System.out.println("You lose :(");
        System.out.println("Play again?");
        System.out.println("0: Yes\n1: No");
    }
    /**
     * Prints the current state of the word to the console.
     *
     * @param word the WordProvider representing the word to be printed
     */
    @Override
    public void printWordSoFar(WordProvider word){
        System.out.println(word);
    }
    /**
     * Prints the next guess message to the console.
     */
    @Override
    public void printNextGuessMessage(){
        System.out.println("Enter your next guess");
    }
    /**
     * Prints the number of guesses left to the console.
     *
     * @param guessesLeft the number of guesses left
     */
    @Override
    public void printNumGuessesLeft(int guessesLeft) {
        System.out.printf("You have %d guesses left :)%n", guessesLeft);
    }
    /**
     * Retrieves the number of commands.
     *
     * @return the number of commands
     */
    public int getNumCommands(){
        return commands.length;
    }
    /**
     * Prints the difficulty message to the console.
     */
    @Override
    public void printDifficultyMessage() {
        System.out.println("Difficulty is set to easy\nChange this in the settings if you're brave");
    }

}
