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

    public static <T extends Person> double averageAge(List<T> personGroup) {
        double average = 0;
        for (T person : personGroup){
            int age = person.getAge();
            average += age;
        }
        average = average / personGroup.size();

        return  average;
//        System.out.println("Average age = " + mean);
    }
}
