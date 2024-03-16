package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

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
}
