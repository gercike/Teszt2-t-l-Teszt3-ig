package Teszt1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class teszt1Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void kangaroosMeet() {
//    x1 = 0; v1 = 3; x2 = 4; v2 = 2; esetén a kenguruk ugrásai:
//            0 => 3 => 6 => 9 => 12 illetve 4 => 6 => 8 => 10 => 12, tehát mindketten pontosan 4 ugrással jutottak
//            el a 12-es számra, így a válaszunk a feladat kérdésére igen.
//
//    Példa #2:
//    x1 = 0; v1 = 2; x2 = 5; v2 = 3; esetén viszont látszik, hogy az első kenguru hátrábbról indul és lassabb is,
//    tehát nem fognak találkozni semmikor a jövőben.
//
//    Bónusz kérdés (+2 pont): Megvalósítható-e ez a kangaroosMeet metódus O(1) futásidővel? Ha igen, akkor
//    implementáld le, ha nem, akkor indokold, hogy miért nem!
        boolean result1 = teszt1.kangaroosMeet(0, 3, 4,2);
        Assert.assertTrue(result1);

        boolean result2 = teszt1.kangaroosMeet(0, 2, 5,3);
        Assert.assertFalse(result2);

        boolean result3 = teszt1.kangaroosMeet(0, 3, 0,2);
        Assert.assertTrue(result3);

        boolean result4 = teszt1.kangaroosMeet(0, 0, 0,0);
        Assert.assertFalse(result4);
    }

    @Test
    public void stairs() {
    }

    @Test
    public void matrixDiagonalDifference() {
    }

    @Test
    public void matrixTopLeftNumber() {
    }

    @Test
    public void countSameNumbers() {
//        Példa: {0, 1, 2, 3, 4} és {5, 6, 5, 4, 4, 4, 3} bemenetek esetén a kimenet 2 legyen, mert az első tömbből csak
//        //    a 3-as és 4-es szám szerepel a második tömbben.
        int result = teszt1.countSameNumbers(new int[]{0, 1, 2, 3, 4}, new int[]{5, 6, 5, 4, 4, 4, 3});
        Assert.assertEquals(2, result);

        int result1 = teszt1.countSameNumbers(new int[]{}, new int[]{5, 6, 5, 4, 4, 4, 3});
        Assert.assertEquals(0, result1);

        int result2 = teszt1.countSameNumbers(new int[]{0, 1, 2, 3, 4}, new int[]{});
        Assert.assertEquals(0, result2);

        int result3 = teszt1.countSameNumbers(new int[]{}, new int[]{});
        Assert.assertEquals(0, result3);

        int result4 = teszt1.countSameNumbers(new int[]{22, 1, 2, 2, 4}, new int[]{3, 3, 3, 3, 3});
        Assert.assertEquals(0, result4);
    }

    @Test
    public void countEvenNumbers() {
        int nums = teszt1.countEvenNumbers(new int[]{1, 2, 4, 3, 2, 7, 1});
        Assert.assertEquals(3, nums);
    }

    @Test
    public void getLastNumber() {
    }
}