package utils;

public class InputValidator {
    public static boolean isValidIntInput(int input, int min, int max){
        return input >= min && input <=max;
    }

    public static boolean isValidGuess(String input){
        return !input.isBlank() && input.length() == 1 && !input.matches("[0-9]");
    }
}
