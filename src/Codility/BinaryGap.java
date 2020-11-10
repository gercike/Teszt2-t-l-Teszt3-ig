package Codility;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

    public static int solution(int decimal) {
        String szam = String.valueOf(decimal);
        char[] decimalNum = new char[szam.length()];
        for (int i = 0; i < decimalNum.length; i++) {
            decimalNum[i] = szam.charAt(i);
        }
        int binaryHossz = 0;
        for (double i = 0; decimal >= Math.pow(2.0, i); i++) {
            binaryHossz = (int) i + 1;
        }
        int[] binary = new int[binaryHossz];
        for (int i = binary.length - 1; i >= 0; i--) {
            binary[i] = decimal % 2;
            decimal = decimal / 2;
        }
        int longestZeros = 0;
        int counter = 0;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0) {
                counter++;
            }
            if (binary[i] == 1 && counter != 0) {
                if (longestZeros < counter) {
                    longestZeros = counter;
                    counter = 0;
                } else {
                    counter = 0;
                }
            }
        }
        return longestZeros;
    }
}

