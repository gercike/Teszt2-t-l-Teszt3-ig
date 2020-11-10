package Codility;

import java.util.Arrays;

public class MaxCounters_lassu {
    public static void main(String[] args) {
        int[] bemeno = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        System.out.println(Arrays.toString(solution(N, bemeno)));
    }

    public static int[] solution(int N, int[] bemeno) {
        int[] tomb = new int[N];
        for (int i = 0, max = 0; i < bemeno.length; i++) {
            if (bemeno[i] != N + 1) {
                tomb[bemeno[i] - 1]++;
                if (tomb[bemeno[i] - 1] > max) {
                    max = tomb[bemeno[i] - 1];
                }
            }
            if (bemeno[i] == N + 1) {
                for (int j = 0; j < tomb.length; j++) {
                    if (tomb[j] != max) {
                        tomb[j] = max;
                    }
                }
            }
        }
        return tomb;
    }
}