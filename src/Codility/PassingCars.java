package Codility;

public class PassingCars {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1};
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        int zeroCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroCounter++;
            }
        }
        int passings = 0;
        int onesPassed = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                passings += array.length - zeroCounter - onesPassed;
            } else {
                onesPassed++;
            }
            if (passings>1000000000){
                return -1;
            }
        }
        return passings;
    }
}
