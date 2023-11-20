package task3;

public class Triangle extends Shape{
    private Double height; //высота
    private Double sideLengths; //сторона к которой проведена высота
    private Double lateralSides; // две другие боковые стороны
    //равнобедренный прямоугольный треугольник



    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getSideLengths() {
        return sideLengths;
    }

    public void setSideLengths(Double sideLengths) {
        this.sideLengths = sideLengths;
    }

    public Double getLateralSides() {
        return lateralSides;
    }

    public void setLateralSides(Double lateralSides) {
        this.lateralSides = lateralSides;
    }

    @Override
    void calculateArea() {
        System.out.println("Area: " + (sideLengths * height) / 2 + "cm2");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + lateralSides * 2 + sideLengths + "cm");
    }
}
