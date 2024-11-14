package Task2;

public interface GeometricFigure {
    double area();

    double perimeter();

    default double rectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    default double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    default double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    String getColor();
}
