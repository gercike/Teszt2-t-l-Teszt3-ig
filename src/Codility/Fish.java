package Codility;

import java.util.Stack;

public class Fish {
    static int[] A = {4, 3, 2, 1, 5};
    static int[] B = {0, 1, 0, 0, 0};
    static int[] A2 = {4, 3, 2, 6, 5};
    static int[] B2 = {1, 1, 1, 0, 1};


    public static void main(String[] args) {
        Fish main = new Fish();
        System.out.println(main.solution(A, B));
    }

    public int solution(int[] A, int[] B) {
        Stack<Integer> river = new Stack<>();
        Stack<Integer> directions = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (i > 0) {
                if (B[i] == 0) {
                    while (river.size() > 0 && river.peek() < A[i] && directions.peek() == 1) {
                        river.pop();
                        directions.pop();
                    }
                    if (river.size() > 0 && river.peek() > A[i] && directions.peek() == 1) {
                        continue;
                    } else {
                        river.push(A[i]);
                        directions.push(B[i]);
                    }
                }
                if (B[i] == 1) {
                    river.push(A[i]);
                    directions.push(B[i]);
                }
            } else {
                river.push(A[i]);
                directions.push(B[i]);
            }
        }
        return river.size();
    }
}
