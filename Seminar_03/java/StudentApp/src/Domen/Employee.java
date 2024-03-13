package Domen;

public class Employee extends Worker {
    private String spetial;

    public Employee(String name, int age, String spetial) {
        super(name, age);
        this.spetial = spetial;
    }
}
