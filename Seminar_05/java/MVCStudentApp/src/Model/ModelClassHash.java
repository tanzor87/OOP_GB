package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;


import java.util.HashMap;
import java.util.List;

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
        for (Student person : students) {
            studentsHas.put(person.getId(), person);
        }
    }

//    public void studentsHas(List<Student> students) {
////        HashMap<Integer, Student> studentsHas = new HashMap<>();
//        for (Student person : students) {
//            studentsHas.put(person.getId(), person);
//        }
//    }


////    private HashMap<Integer, Student> studentsHas;
//    public ModelClassHash(List<Student> students) {
////        this.students = students;
//        HashMap<Integer, Student> studentsHas = new HashMap<>();
//        for (Student person : students){
//            studentsHas.put(person.getId(), person);
//        }
//    }
//
//    public ModelClassHash(HashMap<Integer, Student> studentsHas) {
//        this.studentsHas = studentsHas;
//    }

//    public void StudentsHas (List<Student> students){
////        String
//
//        for (Student person : students){
//            studentsHas.put(person.getId(), person);
//        }
//    }

//        @Override
//        public List<Student> getAllStudents () {
//            return students;
//        }
//    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}
