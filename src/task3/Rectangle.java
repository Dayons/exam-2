package task3;

public class Rectangle extends Shape{
    private Double length;
    private Double width;

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    void calculateArea() {
        System.out.println("Area: " + length * width + " cm2");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter: " + 2*(length + width) + " cm");
    }
}
