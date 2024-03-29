package InterfacePrinciple;

/**
 * клас круг, позволяет расчитать площадь круга
 */
public class Circle implements iArea {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

