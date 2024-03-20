package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс хранит студентов в HashMap
 */

public class ModelClassHash implements iGetModel {
    private List<Student> students;
    private HashMap<Integer, Student> studentsHas;

    /**
     * Конструктор класса
     * Не совсем понятно какие параметры в этот конструктор передавать
     * Если я правильно понимаю, то в этом классе нам нужно списк студентов преобразовать в HashMap
     * Возможно это как то так должно реализовываться
     * @param students
     * @param studentsHas
     */
    public ModelClassHash(List<Student> students, HashMap<Integer, Student> studentsHas) {
        this.students = students;
        this.studentsHas = studentsHas;

    }

    /**
     * Метод преобразует лист студентов в HashMap
     * @param students
     */
    public void studentHas(List<Student> students){
        for (Student person : students) {
            studentsHas.put(person.getId(), person);
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students  = new ArrayList<Student>();

        for (Map.Entry<Integer, Student> s : studentsHas.entrySet()){
            Student person = new Student(s.getValue().getName(), s.getValue().getAge());
            students.add(person);
        }
        return students;
    }
}
