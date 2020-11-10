package Codility;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] szamok1 = {2, 2, 2};
        int[] szamok2 = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] szamok3 = {1};
        System.out.println(solution(1, szamok3));
    }

    public static int solution(int X, int[] array) {
        int maxIdo = 0;
        int counter = 1;
        int[] sorted = new int[X + 1];
        sorted[array[0]] = 0;
        for (int i = 0; i < array.length; i++) {
            if (sorted[array[i]] == 0 && array[i] != array[0]) {
                sorted[array[i]] = i;
                counter++;
                if (i > maxIdo) {
                    maxIdo = i;
                }
                if (counter + 1 == sorted.length) {
                    return maxIdo;
                }
            }
        }
        if (counter + 1 != sorted.length) {
            maxIdo = -1;
        }
        return maxIdo;
    }
}
