package Rectangles;

import java.util.Arrays;
import java.util.Comparator;

public class Rectangle {
    private int[] lowerLeft;
    private int[] upperLeft;
    private int[] lowerRight;
    private int[] upperRight;

    public Rectangle() {
        this.lowerLeft = new int[2];
        this.upperLeft = new int[2];
        this.lowerRight = new int[2];
        this.upperRight = new int[2];
    }

    public int[] getLowerLeft() {
        return lowerLeft;
    }

    public void setLowerLeft(int[] lowerLeft) {
        this.lowerLeft = lowerLeft;
    }

    public int[] getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(int[] upperLeft) {
        this.upperLeft = upperLeft;
    }

    public int[] getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(int[] lowerRight) {
        this.lowerRight = lowerRight;
    }

    public int[] getUpperRight() {
        return upperRight;
    }

    public void setUpperRight(int[] upperRight) {
        this.upperRight = upperRight;
    }

    public boolean isRectangle(int[][] array) {
        if (array.length != 4 && array[0].length != 2) {
            return false;
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                if (t1[0] - t2[0] == 0) {
                    return t1[1] - t2[1];
                }
                return t1[0] - t2[0];
            }
        });
        System.out.println(Arrays.deepToString(array));
        if (array[0][0] == array[1][0] && array[2][0] == array[3][0] && array[0][1] == array[2][1] && array[1][1] == array[3][1]) {
            return true;
        }
        return false;
    }
}
