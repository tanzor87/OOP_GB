package Services;

import Domen.PersonComparator;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements IPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
//        String ad = ;
        Teacher teacher = new Teacher(name, age, "degree");
        count++;
        teachers.add(teacher);
    }

    public  void sortByFio() {
        PersonComparator<Teacher> comparator = new PersonComparator<Teacher>();
        teachers.sort(comparator);
    }
}
