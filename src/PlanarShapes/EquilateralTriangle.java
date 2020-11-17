package PlanarShapes;

public class EquilateralTriangle extends Shape {
    double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)) / 2 * (Math.pow(sideLength, 2)) / 2;
    }

    @Override
    public double getCircumference() {
        return 3 * sideLength;
    }
}
