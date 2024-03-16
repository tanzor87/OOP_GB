package View;

import Model.Domain.Student;

import java.util.List;

/**
 * Класс который отображает студентов
 */
public class ViewClass {
    public void printAllStudents(List<Student> students){
        System.out.println("--------Список Студентов----------");
        for (Student s :students){
            System.out.println(s);
        }
        System.out.println("--------------------");
    }
}
