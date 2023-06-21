package Word;
public class Word_Account {
    private static final char[] Russian_word = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', ',','.','!','?','А','Е','Ё','И','О','У','Ы','Э','Ю','Я',';',':','-'};
    /*private String a;
    private Main main;


    public String getA() {
      return a;
    }*/
    private static boolean isRussianWords(char c) {
        return new String(Russian_word).indexOf(c) != -1;
    }

    public static int main(String getA) {
        String text = getA;
        int name = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isWhitespace(c) &&
                    !isRussianWords(c)) {
                name++;
            }
        }
        //System.out.println(name);
        return name;
    }
}
