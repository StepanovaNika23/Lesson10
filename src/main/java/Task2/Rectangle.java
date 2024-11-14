package Task2;

public class Rectangle implements GeometricFigure {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return rectanglePerimeter(width, height);
    }

    @Override
    public String getColor() {
        return "Цвет заливки: " + fillColor + ", Цвет границ: " + borderColor;
    }
}
