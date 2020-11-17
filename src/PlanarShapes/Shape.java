package PlanarShapes;

public abstract class Shape {
    abstract double getArea();
    abstract double getCircumference();

    public String printName(){
        return getClass().getSimpleName();
    }
}
