package OpenClosePrinciple;

/**
 * Класс позволяет рассчитать допустимуб скорость в зависимости от типа транспортного средства
 * @param <V>
 */
public class SpeedCalculation<V extends Vehicle>{

    public double calculateAllowedSpeed(V vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }

        return 0.0;
    }
}

