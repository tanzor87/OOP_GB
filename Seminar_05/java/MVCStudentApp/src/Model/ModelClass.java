package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.List;

/**
 * Класс который хранит студентов в List<Student>
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

    /**
     * Метод удаляет студента по ID из списка типа List
     * @param studentId - ID студента
     */
    @Override
    public boolean deleteStudent(Integer studentId) {
        boolean removed = false;
        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            if (s.getId() == studentId){
                students.remove(i);
                removed = true;
            }
        }
        return removed;
    }
}
