package icp;
/** класс Окружность реализует один интерфейс форма */
public class Circle implements Shape {
    private double radius;
    /** конструктор */
    public Circle(double radius) {
        this.radius = radius;
    }
    /** вычисление площади */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

}

