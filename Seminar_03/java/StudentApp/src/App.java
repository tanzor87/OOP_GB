import Controllers.AccountController;
import Domen.*;
import Services.StudentService;
import Services.TeacherService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Students
         */

        Student student1 = new Student("Ivan", 22);
        Student student2 = new Student("Oleg", 23);
        Student student3 = new Student("Petr", 20);
        Student student4 = new Student("Ira", 21);
        Student student5 = new Student("Olga", 22);
        Student student6 = new Student("Max", 22);
        Student student7 = new Student("Dima", 21);
        Student student8 = new Student("Viktor", 23);
        Student student9 = new Student("Sergey", 21);
        Student student10 = new Student("Luba", 20);
        Student student11 = new Student("Nadya", 23);
        Student student12 = new Student("Mark", 22);
        Student student19 = new Student("Denis", 21);
        Student student13 = new Student("Andrey", 21);
        Student student14 = new Student("Petya", 23);
        Student student15 = new Student("Tom", 22);
        Student student16 = new Student("Vika", 21);
        Student student17 = new Student("Angela", 21);
        Student student18 = new Student("Dasha", 20);
        Student student20 = new Student("Masha", 21);
        Student student21 = new Student("Ivan", 22);

        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        List<Student> students3 = new ArrayList<>();
        List<Student> students4 = new ArrayList<>();

        students1.add(student6);
        students1.add(student5);
        students1.add(student4);
        students1.add(student2);

        students2.add(student3);
        students2.add(student1);
        students2.add(student7);
        students2.add(student8);
        students2.add(student9);
        students2.add(student10);

        students3.add(student11);
        students3.add(student12);
        students3.add(student19);
        students3.add(student13);
        students3.add(student14);
        students3.add(student15);
        students3.add(student16);
        students3.add(student17);

        students4.add(student18);
        students4.add(student20);
        students4.add(student21);

        StudentGroup group5830 = new StudentGroup(students1, 5830);
        StudentGroup group5831 = new StudentGroup(students2, 5831);
        StudentGroup group5832 = new StudentGroup(students3, 5832);
        StudentGroup group5833 = new StudentGroup(students4, 5833);

        List<StudentGroup> groups = new ArrayList<>();

        groups.add(group5830);
        groups.add(group5831);
        groups.add(group5832);
        groups.add(group5833);

        StudentSteam steams = new StudentSteam(groups, 1);

//        System.out.println(steams);
//        Collections.sort(steams.getStudentGroups());
//
//        for (StudentGroup steam : steams) {
//            System.out.println("ID group: " + steam.getIdGroup());
//            Collections.sort(steam.getGroup());
//
//            for (Student stud : steam.getGroup()) {
//                System.out.println("\t" + stud);
//            }
//            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
//        }

        /**
         *  Seminar 4
         */

        StudentService service = new StudentService();

//        AccountController controller = new AccountController();

        for (Student s : students3) {
            service.create(s.getName(), s.getAge());
        }

        System.out.println("~~~~~IPersonService~~~~~~");
        System.out.println("~~~~~Stedents~~~~~");
        AccountController.print(service.getAll());
        service.sortByFio();
        System.out.println("~~~~~~~Sorted Students~~~~~~~~");
        AccountController.print(service.getAll());

        /**
         *  Teachers
         */

        Teacher t1 = new Teacher("Sergey", 36, "PhD");
        Teacher t2 = new Teacher("Ivan", 39, "Docent");
        Teacher t3 = new Teacher("Tom", 56, "Doctor");
        Teacher t4 = new Teacher("Viktor", 30, "PhD student");
        Teacher t5 = new Teacher("Anna", 37, "PhD");
        Teacher t6 = new Teacher("Alla", 47, "Doktor");
        Teacher t7 = new Teacher("Roman", 41, "Docent");

        List<Teacher> teachers = new ArrayList<>();

        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);
        teachers.add(t6);
        teachers.add(t7);

        Employee e1 = new Employee("Viktor", 55, "Слесарь");

//        AccountController.paySalary(t1, 55000);
//        AccountController.paySalary(e1, 45000);
//        AccountController.paySalary(student3, 5000);

        TeacherService teacherService = new TeacherService();

        for (Teacher t : teachers){
            teacherService.create(t.getName(), t.getAge());
        }

        System.out.println("-------------------\n" + "~~~~~Teachers~~~~~~");

        AccountController.print(teacherService.getAll());
        teacherService.sortByFio();
        System.out.println("~~~~~~~~Sorted Teachers~~~~~~~~~");
        AccountController.print(teacherService.getAll());

        System.out.println("~~~~~Average Age of Teachers~~~~~~");
        System.out.println("Average Age of Teachers is " +
                String.format("%.2f", AccountController.averageAge(teacherService.getAll())) +
                " years");




//        service.print(service.getAll());
//        service.sortByFio();
//        System.out.println("~~~~~~~~~~~~~~~~~");
//        service.print(service.getAll());


//        for (StudentGroup steam : steams) {
//            System.out.println(steam);
//        }
//
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
//
//        Collections.sort(steams.getStudentGroups());
//
//        for (StudentGroup steam : steams) {
//            System.out.println(steam);
//        }

//        for (Student stud : group5830){
//            System.out.println(stud);
//        }

//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
//
//        Collections.sort(group5830.getGroup());
//
//        for (Student stud : group5830) {
//            System.out.println(stud);
//        }
//
    }

}

