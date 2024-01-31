package utils;
/**
 * Utility class for generating random words for the game.
 */
public class WordGenerator {
    private static final String[] WORDS;

    // Private constructor to prevent instantiation of the class
    private WordGenerator(){};

    // Static initialization block to initialize the array of words
    static {
        WORDS = new String[] {
                "Wizard",
                "Dragon",
                "Elf",
                "Dwarf",
                "Sorcerer",
                "Magic",
                "Enchant",
                "Quest",
                "Fairy",
                "Troll"
        };
    }
    /**
     * Generates and returns a random word from the predefined list of words.
     *
     * @return a randomly selected word
     */
    public static String getRandomWord(){
        return WORDS[(int)(Math.random() * WORDS.length)];
    }
}
