package Word;

public class NetSymbols {
    public static int main(String rezult){
        int l = 0;
        String sybbol = String.valueOf(WordAccount.main(rezult));
        for (int j = 0; j < sybbol.length(); j++) {
            l++;
        }
        return l;
    }
}
