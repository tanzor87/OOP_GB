package Services;

import Domen.PersonComparator;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс TeacherService, имплеминтирует интефейс IPersonService
 */

public class TeacherService implements IPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    /**
     * Конструктор класса
     */
    public TeacherService() {
        teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "degree");
        count++;
        teachers.add(teacher);
    }

    /**
     * Метод сортировки учителей по имени
     */
    public  void sortByFio() {
        PersonComparator<Teacher> comparator = new PersonComparator<Teacher>();
        teachers.sort(comparator);
    }
}
