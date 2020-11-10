package Codility;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 9, 7, 6};
        int shiftNumber = 3;
        System.out.println(Arrays.toString(solution(numbers, shiftNumber)));
    }

    public static int[] solution(int[] numbers, int shiftNumber) {
        int[] shiftedNumbers = new int[numbers.length];
        if (numbers.length != 0) {
            shiftNumber = shiftNumber % numbers.length;
        }
        for (int i = 0, j; i < numbers.length; i++) {
            if (i + shiftNumber > numbers.length - 1) {
                j = shiftNumber + i - numbers.length;
            } else {
                j = i + shiftNumber;
            }
            shiftedNumbers[j] = numbers[i];
        }
        return shiftedNumbers;
    }
}

