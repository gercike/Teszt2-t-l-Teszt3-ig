package Codility;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String szo1 = "{[()()]}";
        String szo2 = "([)()]";
        String szo3 = " "; //helyes output: 1
        String szo4 = ")(";
        String szo5 = "{{{{";
        System.out.println(solution(szo5));
    }

    public static int solution(String S) {
        Stack<Character> verem = new Stack<>();
        CharacterIterator iterator = new StringCharacterIterator(S);
        int counter = 0;
        for (char i = iterator.first(); i != CharacterIterator.DONE; i = iterator.next()) {
            if (verem.size() > 0) {
                switch (i) {
                    case (')'):
                        if (i == ')' && verem.peek() == '(') {
                            verem.pop();
                            counter--;
                            break;
                        } else {
                            return 0;
                        }
                    case ('}'):
                        if (i == '}' && verem.peek() == '{') {
                            verem.pop();
                            counter--;
                            break;
                        } else {
                            return 0;
                        }
                    case (']'):
                        if (i == ']' && verem.peek() == '[') {
                            verem.pop();
                            counter--;
                            break;
                        } else {
                            return 0;
                        }
                    default:
                        verem.push(i);
                        if (i == '(' || i == '[' || i == '{') {
                            counter++;
                        }
                }
            } else {
                switch (i) {
                    case (')'):
                        return 0;
                    case ('}'):
                        return 0;
                    case (']'):
                        return 0;
                    default:
                        verem.push(i);
                        if (i == '(' || i == '[' || i == '{') {
                            counter++;
                        }
                }
            }
        }
        if (counter > 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
