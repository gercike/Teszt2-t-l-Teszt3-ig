package Codewars;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryArrayToNumber_or_OneAndZerosTest {

    @Test
    public void convertBinaryArrayToInt() throws Exception {

        assertEquals(1, BinaryArrayToNumber_or_OneAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        assertEquals(15, BinaryArrayToNumber_or_OneAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        assertEquals(6, BinaryArrayToNumber_or_OneAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        assertEquals(9, BinaryArrayToNumber_or_OneAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
        assertEquals(529, BinaryArrayToNumber_or_OneAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 0, 0, 1, 0, 0, 0, 1))));
    }
}