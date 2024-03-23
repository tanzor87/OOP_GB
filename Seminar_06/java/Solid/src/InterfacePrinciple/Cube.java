package InterfacePrinciple;

/**
 * Класс Куб, позволяет расссчитать объем и площадь куба
 */
public class Cube implements iVolume, iArea {
    private int edge;
    public Cube(int edge) {
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
