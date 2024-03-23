package DependencyInvertionPrinciple;

/**
 * Интерфейс бензинового двигателя
 */
public interface iPetrolEngine {
    public default void start() {
    }
}
