package View;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

/**
 * Класс который отображает студентов
 */
public class ViewClass implements iGetView {
    public void printAllStudents(List<Student> students){
        System.out.println("--------Список Студентов----------");
        for (Student s :students){
            System.out.println(s);
        }
        System.out.println("----------------------------------");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
