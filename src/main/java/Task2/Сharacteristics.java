package Task2;

public class Сharacteristics {
    public static void main(String[] args) {
        GeometricFigure circle = new Circle(6, "Синий", "Зеленый");
        GeometricFigure rectangle = new Rectangle(7, 9, "Желтый", "Красный");
        GeometricFigure triangle = new Triangle(8, 4, 10, "Белый", "Черный");
        System.out.println("Круг: Площадь = " + circle.area() + ", Периметр = " + circle.perimeter() + ", " + circle.getColor());
        System.out.println("Прямоугольник: Площадь = " + rectangle.area() + ", Периметр = " + rectangle.perimeter() + ", " + rectangle.getColor());
        System.out.println("Треугольник: Площадь = " + triangle.area() + ", Периметр = " + triangle.perimeter() + ", " + triangle.getColor());
    }
}
