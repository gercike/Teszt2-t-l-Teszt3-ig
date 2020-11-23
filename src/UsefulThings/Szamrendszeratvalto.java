package UsefulThings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Szamrendszeratvalto {
    public static void main(String[] args) {
    }

    public static List<Integer> convertDecimalIntToBinary(int decimal) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (decimal / 2 > 0) {
            arrayList.add(0, decimal % 2);
            decimal = decimal / 2;
        }
        arrayList.add(0, decimal % 2);
        return arrayList;
    }

    public static int convertBinaryArrayToInt(List<Integer> binary) {
        int decimal = 0;
        for (int i = binary.size() - 1, pow = 0; i >= 0; i--, pow++) {
            decimal += binary.get(i) * Math.pow(2, pow);
        }
        return decimal;
    }

    public static int decimalDigitCounter(int decimal) {
        int counter = 1;
        for (int i = 1; decimal % Math.pow(10, i) != decimal; i++) {
            counter++;
        }
        return counter;
    }
}
