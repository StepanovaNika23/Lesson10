package Task2;

public class Circle implements GeometricFigure {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return circlePerimeter(radius);
    }

    @Override
    public String getColor() {
        return "Цвет заливки: " + fillColor + ", Цвет границ: " + borderColor;
    }
}
