package utils;

public class OutputManager implements OutputProvider {

    @Override
    public void printGameOverMessage(){
        System.out.println("You lose... You Suck");
        System.out.println("Play again... ");
    }
    @Override
    public void printWordSoFar(GameWord word){
        System.out.println(word);
    }

    @Override
    public void printNextGuessMessage(){
        System.out.println("Enter your next guess");
    }

    @Override
    public void printNumGuessesLeft(int guessesLeft) {
        System.out.println(String.format("You have %d guesses left :)", guessesLeft));
    }

}
