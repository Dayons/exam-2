package task3;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area: " + Math.PI * getRadius() + " cm2");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + 2 * Math.PI * getRadius() + " cm");
    }
}
