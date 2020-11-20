package Codewars;

import java.util.HashMap;
import java.util.Map;

//Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//
//        Example
//        "abcde" -> 0 # no characters repeats more than once
//        "aabbcde" -> 2 # 'a' and 'b'
//        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//        "indivisibility" -> 1 # 'i' occurs six times
//        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//        "aA11" -> 2 # 'a' and '1'
//        "ABBA" -> 2 # 'A' and 'B' each occur twice
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            hm.putIfAbsent(Character.toLowerCase(text.charAt(i)), 0);
            hm.put(Character.toLowerCase(text.charAt(i)), hm.get(Character.toLowerCase(text.charAt(i))) + 1);
        }
        int counter = 0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : hm.entrySet()) {
            if (characterIntegerEntry.getValue() > 1) {
                counter++;
            }
        }
        return counter;
    }
}
