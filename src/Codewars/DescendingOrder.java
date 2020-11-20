package Codewars;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        int test = 645214536;
        System.out.println(sortDesc(test));
    }

    public static int sortDesc(final int num) {
        String nr = Integer.toString(num);
        Integer[] numArray = new Integer[nr.length()];
        for (int i = 0; i < nr.length(); i++) {
            numArray[i] = Integer.parseInt(nr.substring(i, i+1));
        }
        Arrays.sort(numArray, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Integer integer : numArray) {
            sb.append(integer);
        }
        int n = Integer.parseInt(sb.toString());
        return n;
    }
}
