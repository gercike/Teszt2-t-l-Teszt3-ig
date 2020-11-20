package Codility;

import java.util.*;

public class NumberOfDiscIntersections {
    int[] test1 = {1, 5, 2, 1, 4, 0};
    //    [[-4, 6], [-1, 1], [0, 4], [0, 8], [2, 4], [5, 5]]
    int[] test2 = {1, 2147483647, 0};

    public static void main(String[] args) {
        NumberOfDiscIntersections main = new NumberOfDiscIntersections();
        System.out.println(main.solutionA(main.test2));
    }


//    public int solutionB(int[] A) {
//        TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
//        for (int i = 0; i < A.length; i++) {
//            tm.putIfAbsent(i - A[i], new ArrayList<Integer>());
//            tm.get(i - A[i]).add(i + A[i]);
//        }
//        for (int i = 0; i < tm.entrySet().size(); i++) {
//            for (int j = 0; j < tm.get(i); j++) {
//
//            }
//        }
//        System.out.println(tm);
//        return 1;
//    }

    public int solutionA(int[] A) {
        int[][] tomb = new int[A.length][2];
        for (int i = 0; i < A.length; i++) {
            tomb[i][0] = i - A[i];
            tomb[i][1] = i + A[i];
        }
        Arrays.sort(tomb, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                if (t1[0] == t2[0]) {
                    return t1[1] - t2[1];
                }
                return t1[0] - t2[0];
            }
        });
        System.out.println(Arrays.deepToString(tomb));
        int counter = 0;
        for (int i = 0; i < tomb.length - 1; i++) {
            for (int j = i + 1; j < tomb.length && tomb[j][0] <= tomb[i][1]; j++) {
                counter += 1;
                if (counter > 10000000) {
                    return -1;
                }
            }
        }
        return counter;
    }
}
