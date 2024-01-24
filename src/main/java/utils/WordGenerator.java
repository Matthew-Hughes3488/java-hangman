package utils;

public class WordGenerator {
    private static final String[] WORDS;

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

    public static String getRandomWord(){
        return WORDS[(int)(Math.random() * WORDS.length)];
    }
}
