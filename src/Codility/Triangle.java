package Codility;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] szamok1 = {5, 3, 3};
        System.out.println(solution(szamok1));
    }

    public static int solution(int[] array) {
        int result = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] > array[i + 2] - array[i + 1] && array[i + 1] > array[i] - array[i + 2] && array[i] > array[i + 1] - array[i + 2]) {
                return 1;
            }
        }
        return result;
    }
}