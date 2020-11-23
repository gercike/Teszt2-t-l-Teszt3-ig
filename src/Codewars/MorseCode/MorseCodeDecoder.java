package Codewars.MorseCode;

//should return "HEY JUDE"

import java.io.FileNotFoundException;

public class MorseCodeDecoder {

    public static String decode(String morseCode) throws FileNotFoundException {
        String[] words = morseCode.trim().split("   ");
        String[][] letters = new String[words.length][];
        for (int i = 0; i < words.length; i++) {
            letters[i] = words[i].split(" ");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            for (String s : letters[i]) {
                sb.append(MorseCode.get(s));
            }
            if (i < letters.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
