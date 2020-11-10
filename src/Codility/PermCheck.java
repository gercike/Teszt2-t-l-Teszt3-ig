package Codility;

public class PermCheck {
    public static void main(String[] args) {
        int[] tomb1 = {4, 1, 3, 2};
        int[] tomb2 = {4, 1, 3};
        int[] tomb3 = {1, 4, 1};
        int[] tomb4 = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
        System.out.println(solution(tomb3));
    }

    public static int solution(int[] array) {
        int max = 0;
        int sumOfArray = 0;
        int sumOfPermutation = 0;
        int[] arrayOfIdxs = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>array.length){
                return 0;
            }
            if (arrayOfIdxs[array[i]] == 0) {
                arrayOfIdxs[array[i]] = i;
            } else{
                return 0;
            }
            if (array[i] > max) {
                max = array[i];
            }
            sumOfArray += array[i];
            sumOfPermutation += i;
            if (i == array.length - 1) {
                sumOfPermutation += i + 1;
            }
        }
        if (array.length != max) {
            return 0;
        }
        if (sumOfArray == sumOfPermutation) {
            return 1;
        } else {
            return 0;
        }
    }
}
