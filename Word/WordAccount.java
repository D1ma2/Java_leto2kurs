package Word;

public class WordAccount {
    public static char[] main(String a) {
        String text = a;
        Word word = new Word();
        char[] count = word.countNonRussianWords(text);
        return count;
    }
}