package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
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
                String userInput = SCANNER.nextLine();
                if(userInput.isBlank()) throw new InputMismatchException("Input cannot be blank");
                SCANNER.nextLine();
                return userInput;
            }catch (Exception e){
                System.out.println(e.getMessage());
                SCANNER.nextLine();
            }
        }
    }

}
