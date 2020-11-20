package Codewars;

//        Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//        For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//        Note: The function accepts an integer and returns an integer
public class SquareEveryDigit {

    public static void main(String[] args) {
        SquareEveryDigit s = new SquareEveryDigit();
        System.out.println(s.squareDigits(9119));
    }

    public int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();
        String nr = Integer.toString(n);
        for (int i = 0; i < nr.length(); i++) {
            int num = (int) Math.pow(Double.parseDouble(nr.substring(i, i + 1)), 2);
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }
}
