package src.main.java;

public class WordValidator {
    public static final int VALID_WORD_LENGTH = 5;

    /**
     * Returns true if the String word could be a valid word in this dictionary. A valid word meets both of
     * the following conditions:<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;1) The word is five characters long<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;2) The word is made up of English letters (see {@link WordValidator#isAllLetters(String)})<br>
     * Returns false if *either* condition is false.
     */
    public boolean isValidWord(String word) {
        return isCorrectLength(word) && isAllLetters(word);
    }

    /**
     * Returns true if the word is the correct length
     */
    protected boolean isCorrectLength(String word) {
        return word.length() == VALID_WORD_LENGTH;
    }

    /**
     * Returns true if an input word is made up entirely of English letters A-Z (case-insensitive).
     */
    protected boolean isAllLetters(String word) {
        word = word.toLowerCase();
        for (int index = 0; index < word.length(); index++) {
            var character = word.charAt(index);
            if (character < 'a' || character > 'z') {
                return false;
            }
        }
        return true;
    }
}
