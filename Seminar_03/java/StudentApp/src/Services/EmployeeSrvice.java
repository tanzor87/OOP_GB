package Services;

import Domen.Employee;
import java.util.List;

public class EmployeeSrvice implements IPersonService<Employee> {
    private int count;
    private List<Employee> employees;

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee employee = new Employee(name, age, "basis");
        count++;
        employees.add(employee);

    }

//    @Override
//    public void print(List<Employee> group) {
//        for (Employee employee : group){
//            System.out.println(employee);
//        }
//    }
}
