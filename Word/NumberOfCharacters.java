package Word;

import java.util.Arrays;

public class NumberOfCharacters {
   public static int main(String rezult) {
        int numb = 0;
       String numb_cr = String.valueOf(WordAccount.main(rezult));
       for (int i = 0; i < numb_cr.length(); i++) {
               numb++;
           }
       return numb;
       }

    }