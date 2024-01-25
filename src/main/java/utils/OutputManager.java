package utils;

public class OutputManager implements OutputProvider {

    @Override
    public void printGameStart() {
        System.out.println("The game has begun");
    }

    @Override
    public void printWinMessage() {
        System.out.println("You win :)");
        System.out.println("Play again?");
    }

    @Override
    public void printLoseMessage() {
        System.out.println("You lose :(");
        System.out.println("Play again?");
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
        System.out.printf("You have %d guesses left :)%n", guessesLeft);
    }

}
