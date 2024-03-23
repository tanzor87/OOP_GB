package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.Iterator;
import java.util.List;

/**
 * Класс который хранит студентов
 */
public class ModelClass implements iGetModel {
    private List<Student> students;

    /**
     * Конструктор класса
     * Получения списка студентов
     * @param students
     */
    public ModelClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    public boolean deleteStudent(String studentName) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (!s.getName().equals(studentName)) {
                return false;
            }
            it.remove();
        }

        return true;
    }
}
