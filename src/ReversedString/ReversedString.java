package ReversedString;

import java.util.stream.IntStream;

public class ReversedString implements CharSequence {
    String text;

    public ReversedString(String st) {
        StringBuilder reversed = new StringBuilder();
        for (int i = st.length() - 1; i >= 0; i--) {
            reversed.append(st.charAt(i));
        }
        this.text = reversed.toString();
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int i) {
        return text.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return text.subSequence(i, i1);
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
