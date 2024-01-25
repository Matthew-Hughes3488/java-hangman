package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager implements InputProvider {
    private final Scanner SCANNER = new Scanner(System.in);

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
