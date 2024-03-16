package Model;

import Model.Domain.Student;

import java.util.List;

/**
 * Класс который хранит студентов
 */
public class ModelClass {
    private List<Student> students;

    public ModelClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return students;
    }
}
