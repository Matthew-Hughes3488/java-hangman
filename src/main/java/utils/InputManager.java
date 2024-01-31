package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * The InputManager class provides methods for retrieving user input from the console.
 */
public class InputManager implements InputProvider {
    private final Scanner SCANNER = new Scanner(System.in);
    /**
     * Retrieves an integer input from the user within the specified range.
     *
     * @param min The minimum value allowed.
     * @param max The maximum value allowed.
     * @return The integer input from the user.
     * @throws InputMismatchException if the input is not an integer or not within the specified range.
     */
    public int getIntegerInput(int min, int max){
        while(true){
            try{
                int userInput = SCANNER.nextInt();
                if(!InputValidator.isValidIntInput(userInput, min, max))
                    throw new InputMismatchException(String.format("Number not in range of %d to %d", min, max));
                SCANNER.nextLine();
                return userInput;
            }catch (Exception e){
                System.out.println(e.getMessage());
                SCANNER.nextLine();
            }
        }
    }
    /**
     * Retrieves a string input from the user.
     *
     * @return The string input from the user.
     * @throws InputMismatchException if the input is blank.
     */
    public String getStringInput(){
        while(true){
            try{
                String userInput = SCANNER.nextLine().trim();
                if(userInput.isBlank()) throw new InputMismatchException("Input cannot be blank");
                return userInput;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    /**
     * Retrieves a single character input from the user.
     *
     * @return The character input from the user.
     * @throws InputMismatchException if the input is blank or more than one character.
     */
    public char getCharInput(){
        while(true){
            try{
                String userInput = SCANNER.nextLine().trim();
                if(userInput.isBlank()) throw new InputMismatchException("Input cannot be blank");
                if(userInput.length() > 1) throw new IllegalArgumentException("Input can only be one character");
                return userInput.toCharArray()[0];
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
