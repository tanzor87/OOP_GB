package Controllers;

import Domen.Person;
import Domen.Worker;

import java.util.List;

public class AccountController {
    public static  <V extends Person> void print(List<V> group) {
        for (V person : group){
            System.out.println(person);
        }
    }

    public static <T extends Worker> void paySalary(T person, int salary){
        System.out.println(person.getName() + ": Выплачена зарплата " + salary + " руб.");
    }
}
