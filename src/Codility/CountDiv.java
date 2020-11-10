package Codility;

public class CountDiv {
    public static void main(String[] args) {
        System.out.println(solution(11, 345, 17));
    }

    public static int solution(int A, int B, int K) {
        int number = (B - A) / K;
        if (A != B && A % K == 0) {
            number += 1;
        }
        if (A != B && B % K == 0) {
            number += 1;
        }
        return number;
    }
}
