package DependencyInvertionPrinciple;

/**
 * класс запуска двигателя автомобиля
 * позволяет запускать двигатели как бензиновые так и дизельные двигатели,
 * в зависомости от того какой двигатель используется
 * @param <T>
 */
public class Car<T extends Engine>  {
    private T engine;
    public Car(T engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}
