package Codility;

import java.util.Arrays;
import java.util.Random;

public class MaxCounters {
    public static void main(String[] args) {
        int[] bemeno1 = {3, 4, 4, 6, 1, 4, 4};//N=5
        int[] bemeno2 = {3, 4, 4, 6, 1, 4, 4, 6, 3, 1, 1, 4, 5, 6, 5};//N=5
        int[] bemeno3 = {1};//N=1
        int[] bemeno4 = {2, 1, 1, 2, 1};//N=1
        int[] bemeno5 = {3, 4, 4, 6, 1, 4, 4, 6, 3, 1, 1, 4, 5, 6, 5, 6, 3, 2, 6, 3, 2, 6};//N=5
        int[] bemeno6 = {2, 1, 6, 4, 3, 5, 4, 5, 2, 3, 2, 4, 3, 6, 6, 1, 6, 1, 5, 5, 2, 3, 5, 2, 1, 4, 5, 4, 3, 6};//N=5 should be [9, 9, 9, 9, 9]
//        Random rndmzr = new Random();
//        int[] szamtomb = new int[30];
//        for (int i = 0; i < szamtomb.length; i++) {
//            szamtomb[i] = rndmzr.nextInt(6)+1;
//        }
//        System.out.println(Arrays.toString(szamtomb));
//        System.out.println(Arrays.toString(MaxCounters_lassu.solution(5, szamtomb)));
        System.out.println(Arrays.toString(solution(5, bemeno6)));
    }

    public static int[] solution(int N, int[] bemeno) {
        int[] tomb = new int[N];
        for (int i = 0, actMax = 0, nextMax = 0; i < bemeno.length; i++) {
            if (i == bemeno.length - 1 && bemeno.length > 1) {
                if (bemeno[i] != N + 1) {
                    for (int j = 0; j < tomb.length; j++) {
                        if (tomb[j] < actMax) {
                            tomb[j] = actMax;
                        }
                    }
                    tomb[bemeno[i] - 1]++;
                }
                if (bemeno[i] == N + 1) {
                    for (int j = 0; j < tomb.length; j++) {
                        tomb[j] = nextMax;
                    }
                }
            } else {
                if (bemeno[i] == N + 1) {
                    actMax = nextMax;
                    continue;
                }
                if (tomb[bemeno[i] - 1] <= actMax) {
                    tomb[bemeno[i] - 1] = actMax + 1;
                    if (tomb[bemeno[i] - 1] > nextMax) {
                        nextMax = tomb[bemeno[i] - 1];
                    }
                } else {
                    tomb[bemeno[i] - 1]++;
                    if (tomb[bemeno[i] - 1] > nextMax) {
                        nextMax = tomb[bemeno[i] - 1];
                    }
                }
            }
        }
        return tomb;
    }
}
