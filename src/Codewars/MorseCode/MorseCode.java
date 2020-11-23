package Codewars.MorseCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class MorseCode {
    static TreeMap<String, String> codeTable = new TreeMap<>();

    public MorseCode() throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/Codewars/MorseCode/morse codes.txt"));
        for (int i = 0; s.hasNextLine(); i++) {
            String[] row = s.nextLine().split(" ");
            codeTable.put(row[1], row[0]);
        }
    }

    public static String get(String letter) throws FileNotFoundException {
        new MorseCode();
        return codeTable.get(letter);
    }
}
