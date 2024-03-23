package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Класс хранит студентов в HashMap
 */

public class ModelClassHash implements iGetModel {
    private HashMap<Integer, Student> studentsHas;

    /**
     * Конструктор класса
     * Преобразует List<Students> в HashMap<Integer, Student>
     * @param students - список студентов
     */
    public ModelClassHash(List<Student> students){
        this.studentsHas = new HashMap<>();
        for (Student person : students) {
            studentsHas.put(person.getId(), person);
        }
    }

    /**
     * Обратное преобразование HashMap<Integer, Student> в List<Students>
     * @return
     */
    @Override
    public List<Student> getAllStudents() {
        if (studentsHas == null) {
            return null;
        }

        List<Student> students = new ArrayList<Student>(studentsHas.values());

        return students;
    }

    /**
     * Удаление студента из HAshMap по ID
     * @param studentId -ID студента, которе требуется удалить
     */
    @Override
    public boolean deleteStudent(Integer studentId) {
        if (!studentsHas.containsKey(studentId)){
            return false;
        }
        studentsHas.remove(studentId);
        return true;
    }
}

