package Codewars;

import java.util.List;

public class BinaryArrayToNumber_or_OneAndZeros {
        public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int decimal = 0;
        for (int i = binary.size() - 1, pow = 0; i >= 0; i--, pow++) {
            decimal += binary.get(i) * Math.pow(2, pow);
        }
        return decimal;
    }
}
