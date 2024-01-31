package utils;
/**
 * The InputValidator class provides static methods for validating user input.
 */
public class InputValidator {
    /**
     * Validates an integer input against the specified range.
     *
     * @param input The integer input to validate.
     * @param min   The minimum value allowed.
     * @param max   The maximum value allowed.
     * @return True if the input is within the specified range, false otherwise.
     */
    public static boolean isValidIntInput(int input, int min, int max){
        return input >= min && input <=max;
    }
    /**
     * Validates a guess input for a game.
     *
     * @param input The guess input to validate.
     * @return True if the input is a non-blank string of length 1 and not a digit, false otherwise.
     */
    public static boolean isValidGuess(String input){
        return !input.isBlank() && input.length() == 1 && !input.matches("[0-9]");
    }
}
