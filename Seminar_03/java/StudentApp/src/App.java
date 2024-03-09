import Domen.Student;
import Domen.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Ivan", 22);
        Student student2 = new Student("Oleg", 23);
        Student student3 = new Student("Petr", 20);
        Student student4 = new Student("Ira", 21);
        Student student5 = new Student("Olga", 22);
        Student student6 = new Student("Max", 22);

        List<Student> students = new ArrayList<>();
        students.add(student6);
        students.add(student5);
        students.add(student4);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        StudentGroup group5830 = new StudentGroup(students, 5830);


        for (Student stud : group5830){
            System.out.println(stud);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        Collections.sort(group5830.getGroup());

        for (Student stud : group5830){
            System.out.println(stud);
        }

    }

}

