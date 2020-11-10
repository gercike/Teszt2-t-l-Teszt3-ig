package Codility;

import java.util.HashSet;

public class Distinct {

    public int solution(int[] array) {
        HashSet<Integer> distinct = new HashSet<>();
        for (int i : array) {
            distinct.add(i);
        }
        return distinct.size();
    }
}
