package OpenClosePrinciple;

/**
 * транспортное средство типа автобус
 */
public class Bus extends Vehicle{
    private int numberOfPass;

    public Bus(int maxSpeed, String type, int numberOfPass) {
        super(maxSpeed, type);
        this.numberOfPass = numberOfPass;
    }

    public int getNumberOfPass() {
        return numberOfPass;
    }
}
