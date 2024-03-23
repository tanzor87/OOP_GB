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
//    private List<Student> students;
    private HashMap<Integer, Student> studentsHas;

    /**
     * Конструктор класса
     * Не совсем понятно какие параметры в этот конструктор передавать
     * Если я правильно понимаю, то в этом классе нам нужно списк студентов преобразовать в HashMap
     * Возможно это как то так должно реализовываться
     * @param students
//     * @param studentsHas
     */
//    public ModelClassHash(List<Student> students, HashMap<Integer, Student> studentsHas) {
////        this.students = students;
//        this.studentsHas = studentsHas;
//
//    }

    public ModelClassHash(List<Student> students){
        this.studentsHas = new HashMap<>();
        for (Student person : students) {
            studentsHas.put(person.getId(), person);
        }
    }

//    /**
//     * Метод преобразует лист студентов в HashMap
//     * @param students
//     */
//    public void studentHas(List<Student> students){
//        for (Student person : students) {
//            studentsHas.put(person.getId(), person);
//        }
//    }

    @Override
    public List<Student> getAllStudents() {
        if (studentsHas == null) {
            return null;
        }

        List<Student> students = new ArrayList<Student>(studentsHas.values());

//        for (Map.Entry<Integer, Student> s : studentsHas.entrySet()){
//            Student person = new Student(s.getValue().getName(), s.getValue().getAge());
//            students.add(person);
//        }
        return students;
    }

    /**
     * Удаление студента из HAshMap по его имени
     * @param studentName - имя студента, которе требуется удалить
     */
    @Override
    public boolean deleteStudent(String studentName) {
        Integer idDel = null;
        boolean flag = true;
        for (Map.Entry<Integer, Student> s : studentsHas.entrySet()){
            Integer id = s.getKey();
            String name = s.getValue().getName();
            System.out.println(id);

            if (name.equals(studentName)){
                idDel = id;
            }else {
                flag = false;
            }
        }
        studentsHas.remove(idDel);
        return flag;
    }
}

