package OpenClosePrinciple;

public class Car extends Vehicle {
    private int horsePower;

    public Car(int maxSpeed, String type, int horsePower) {
        super(maxSpeed, type);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
