package Codility;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] numbers = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] szam) {
        Arrays.sort(szam);
        int odd = 0;
        for (int i = 0; i < szam.length; i = i + 2) {
            if (i == szam.length - 1) {
                odd = szam[szam.length - 1];
                break;
            }
            if (szam[i] != szam[i + 1]) {
                odd = szam[i];
                break;
            }
        }
        return odd;
    }
}
