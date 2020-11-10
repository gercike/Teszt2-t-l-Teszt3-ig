package Codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] array) {
        Arrays.sort(array);
        int maxMin = array[0]*array[1]*array[array.length-1];
        int maxPos = array[array.length-1]*array[array.length-2]*array[array.length-3];
        if (maxMin>maxPos){
            return maxMin;
        } else {
            return maxPos;
        }
    }
}
