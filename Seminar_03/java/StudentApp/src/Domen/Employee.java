package Domen;

public class Employee extends Person {
    private String spetial;

    public Employee(String name, int age, String spetial) {
        super(name, age);
        this.spetial = spetial;
    }
}
