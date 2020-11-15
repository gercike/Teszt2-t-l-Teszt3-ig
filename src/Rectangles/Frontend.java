package Rectangles;

public class Frontend {
    static int[][] points = {{2, 4}, {2, 2}, {5, 4}, {5, 2}, {12, 4}, {12, 2}};

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int counter = 0;
        for (int i = 0; i < points.length - 3; i++) {
            for (int j = i + 1; j < points.length - 2; j++) {
                for (int k = j + 1; k < points.length - 1; k++) {
                    for (int l = k + 1; l < points.length; l++) {
                        int[][] array = {points[i], points[j], points[k], points[l]};
                        if (rectangle.isRectangle(array)) {
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
