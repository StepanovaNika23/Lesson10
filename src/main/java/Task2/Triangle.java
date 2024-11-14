package Task2;

public class Triangle implements GeometricFigure {
    private double a;
    private double b;
    private double c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        double s = trianglePerimeter(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return trianglePerimeter(a, b, c);
    }

    @Override
    public String getColor() {
        return "Цвет заливки: " + fillColor + ", Цвет границ: " + borderColor;
    }
}
