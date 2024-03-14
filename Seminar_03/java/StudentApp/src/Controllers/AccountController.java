package Controllers;

import Domen.Person;
import Domen.Worker;

import java.util.List;

/**
 * Класс Контроллеров включает в себя  три метода: print, paySalary, averageAge
 */

public class AccountController {
    /**
     * метод print принимате список людей, наследников класса Person
     * @param group - список людей
     * @param <V> - тип данных потомок класса Person
     */
    public static  <V extends Person> void print(List<V> group) {
        for (V person : group){
            System.out.println(person);
        }
    }

    /**
     * Метод выводит в в консоль зарплату полученную работником
     * Зарплата может выплачиваться только работникам
     * @param person - работник
     * @param salary - значение выплаченой зарплаты
     * @param <T> - тип данных, потомок класса Worker
     */
    public static <T extends Worker> void paySalary(T person, int salary){
        System.out.println(person.getName() + ": Выплачена зарплата " + salary + " руб.");
    }

    /**
     * Метод вычесляет средний возраст группы лиц
     * @param personGroup - Группа лиц для расчета среднего возраста
     * @return - средний возраст, тип данных double
     * @param <T> - тип данныб, потомок класса Person
     */
    public static <T extends Person> double averageAge(List<T> personGroup) {
        double average = 0;
        for (T person : personGroup){
            int age = person.getAge();
            average += age;
        }
        average = average / personGroup.size();

        return  average;
    }
}
