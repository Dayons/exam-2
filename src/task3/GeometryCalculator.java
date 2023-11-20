package task3;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.print("Put the radius of the circle: ");
        Double radius = scanner.nextDouble();

        circle.setRadius(radius);
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.print("\nPut the length of rectangle: ");
        Double length = scanner.nextDouble();

        System.out.print("Put the width of rectangle: ");
        Double width = scanner.nextDouble();

        rectangle.setLength(length);
        rectangle.setWidth(width);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();


        System.out.print("\nPut the height of triangle: ");
        Double height = scanner.nextDouble();

        System.out.print("Put the length of side of the triangle: ");
        Double sideLengths = scanner.nextDouble();

        System.out.print("Put the other lateral sides: ");
        Double lateralSides = scanner.nextDouble();


        triangle.setHeight(height);
        triangle.setSideLengths(sideLengths);
        triangle.setLateralSides(lateralSides);

        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}