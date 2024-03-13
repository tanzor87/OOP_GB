package Services;

import Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IPersonService<Student>{
    private int count;
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        Student student = new Student(name, age);
        count++;
        students.add(student);

    }
}
