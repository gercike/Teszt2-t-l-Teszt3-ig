package Codility;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Stack;

public class Nesting {
    static String s1 = "(()(())())";
    static String s2 = "())";

    public static void main(String[] args) {
        Nesting main = new Nesting();
        System.out.println(main.solution(s2));
    }

    public int solution(String S) {
        Stack<Character> verem = new Stack<>();
        CharacterIterator iterator = new StringCharacterIterator(S);
        if (S.length() == 0) {
            return 1;
        }
        for (char i = iterator.first(); i != CharacterIterator.DONE; i = iterator.next()) {
            if (i == '(') {
                verem.push(i);
            } else {
                if (verem.size() == 0) {
                    return 0;
                } else if (verem.peek() == '(') {
                    verem.pop();
                }
            }
        }
        if (verem.size() > 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
