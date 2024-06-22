package exceptions;

public class WrongWordsCountException extends RuntimeException {
    public int words;

    public WrongWordsCountException(int wordsInput) {
        this.words = wordsInput;
    }
}
