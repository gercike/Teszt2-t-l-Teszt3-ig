package Codewars.MorseCode;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdvancedMorseCodeDecoder {

    public static String decodeBits(String bits) {
        String trimmed = bits.substring(bits.indexOf("1"), bits.lastIndexOf("1") + 1);
        System.out.println(trimmed.length());
        ArrayList<String> ditsAndDahs = new ArrayList<>();
        for (int i = 0, start = 0; i < trimmed.length(); i++) {
            if (trimmed.length() == 1) {
                ditsAndDahs.add(trimmed.substring(start, i + 1));
            }
            if (trimmed.length() > 1 && i < trimmed.length() - 1 && !trimmed.substring(i, i + 1).equals(trimmed.substring(i + 1, i + 2))) {
                ditsAndDahs.add(trimmed.substring(start, i + 1));
                start = i + 1;
            }
            if (i == trimmed.length() - 2) {
                ditsAndDahs.add(trimmed.substring(start, i + 2));
            }
        }
        int maxlength = 0;
        for (String ditsAndDah : ditsAndDahs) {
            if (ditsAndDah.length() > maxlength) {
                maxlength = ditsAndDah.length();
            }
        }
        for (int i = 0; i < ditsAndDahs.size(); i++) {
            if (ditsAndDahs.get(i).length() % maxlength != 0) {
                maxlength--;
                i = 0;
            }
        }
        System.out.println(ditsAndDahs);
        for (int i = 0; i < ditsAndDahs.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < ditsAndDahs.get(i).length() / maxlength; j++) {
                sb.append(ditsAndDahs.get(i).substring(j, j + 1));
            }
            String dad = sb.toString();
            ditsAndDahs.set(i, dad);
        }
        System.out.println(ditsAndDahs);
        ArrayList<String> morseCodeArray = new ArrayList<>();
        for (int i = 0; i < ditsAndDahs.size(); i++) {
            switch (ditsAndDahs.get(i)) {
                case "1":
                    morseCodeArray.add(".");
                    break;
                case "111":
                    morseCodeArray.add("-");
                    break;
                case "000":
                    morseCodeArray.add(" ");
                    break;
                case "0000000":
                    morseCodeArray.add("   ");
                    break;
            }
        }
        System.out.println(morseCodeArray);
        StringBuilder sb = new StringBuilder();
        for (String s : morseCodeArray) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String decodeMorse(String morseCode) throws FileNotFoundException {
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
