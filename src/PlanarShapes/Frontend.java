package PlanarShapes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frontend {
    public static List<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        dataIntoList();
        printInfo(shapes);
        System.out.println(getLargestShape(shapes).getClass().getSimpleName());
    }

    public static Shape getLargestShape(List<Shape> shapes) {
        Shape largest = null;
        double largestArea = 0;
        for (Shape shape : shapes) {
            if (shape.getArea() > largestArea) {
                largestArea = shape.getArea();
                largest = shape;
            }
        }
        return largest;
    }

    static void printInfo(List<Shape> shapes) {
        for (Shape shape : shapes) {
            printInfo(shape);
        }
    }

    static void printInfo(Shape s) {
        if (s.getArea() > s.getCircumference()) {
            System.out.println("This shape is fat. Rate: " + s.getArea() / s.getCircumference());
        } else if (s.getArea() < s.getCircumference()) {
            System.out.println("This shape is thin. Rate: " + s.getArea() / s.getCircumference());
        } else {
            System.out.println("This shape is perfect. Rate: " + s.getArea() / s.getCircumference());
        }
    }

    static void dataIntoList() throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/PlanarShapes/shapes.csv"));
        for (int i = 0; s.hasNextLine(); i++) {
            String[] row = s.nextLine().split(",");
            int shapeCode = Integer.parseInt(row[0]);
            switch (shapeCode) {
                case 0:
                    shapes.add(new Circle(Integer.parseInt(row[1])));
                    break;
                case 3:
                    shapes.add(new EquilateralTriangle(Integer.parseInt(row[1])));
                    break;
                case 4:
                    shapes.add(new Square(Integer.parseInt(row[1])));
                    break;
                case 6:
                    shapes.add(new RegularHexagon(Integer.parseInt(row[1])));
                    break;
            }
        }
    }
}
