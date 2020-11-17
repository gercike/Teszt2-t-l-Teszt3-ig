package PlanarShapes;

public class RegularHexagon extends Shape {
    double sideLength;

    public RegularHexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * 3 / 2 * Math.pow(sideLength, 2);
    }

    @Override
    public double getCircumference() {
        return 6 * sideLength;
    }
}
