package Word;
public class Word {
    private final char[] Russian_word = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', ',', '.', '!', '?', 'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я', ';', ':', '-'};
    char not_RussianWord[] = {};
    private boolean isRussianWords(char c) {
        return new String(Russian_word).indexOf(c) != -1;
    }

    public char[] countNonRussianWords(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isWhitespace(c) && !isRussianWords(c)) {
                char[] word = new char[not_RussianWord.length + 1];
                for (int j = 0; j < not_RussianWord.length; j++) {
                    word[j] = not_RussianWord[j];
                }
                word[word.length - 1] = c;
                not_RussianWord = word;
            }
        }
        return not_RussianWord;
    }
}


