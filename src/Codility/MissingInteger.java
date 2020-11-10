package Codility;

public class MissingInteger {
    public static void main(String[] args) {
        int[] tomb1 = {1, 3, 8, 4, 1, 2};
        int[] tomb2 = {1, 2, 3};
        int[] tomb3 = {-1, -3};
        int[] tomb4 = {2};
        int[] tomb5 = {-1000000, 1000000};
        System.out.println(solution(tomb5));
    }

    public static int solution(int[] array) {
        boolean[] tomb = new boolean[1000001];
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && !tomb[array[i]]) {
                tomb[array[i]] = true;
            }
        }
        for (int i = 1; i < tomb.length; i++) {
            if (i == tomb.length - 1 && tomb[i]) {
                minimum = tomb.length;
            }
            if (!tomb[i]) {
                minimum = i;
                return minimum;
            }
        }
        return minimum;
    }
}
