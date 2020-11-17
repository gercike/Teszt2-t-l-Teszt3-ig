package PlanarShapes;

public class Square extends Shape {
    double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public double getCircumference() {
        return 4 * sideLength;
    }
}
