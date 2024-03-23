package DependencyInvertionPrinciple;

public class Car<T extends Engine>  {
    private T engine;
    public Car(T engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}
