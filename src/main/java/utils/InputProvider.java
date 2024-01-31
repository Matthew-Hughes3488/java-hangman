package utils;
/**
 * The InputProvider interface defines methods for retrieving user input.
 */
public interface InputProvider {
    /**
     * Retrieves an integer input from the user within the specified range.
     *
     * @param min The minimum value allowed.
     * @param max The maximum value allowed.
     * @return The integer input from the user.
     */
    public int getIntegerInput(int min, int max);
    /**
     * Retrieves a string input from the user.
     *
     * @return The string input from the user.
     */
    public String getStringInput();
    /**
     * Retrieves a single character input from the user.
     *
     * @return The character input from the user.
     */
    public char getCharInput();
}
