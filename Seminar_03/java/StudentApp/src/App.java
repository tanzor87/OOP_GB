import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

import java.util.ArrayList;
import java.util.Collection;
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
        Collections.sort(steams.getStudentGroups());

        for (StudentGroup steam : steams) {
            System.out.println("ID group: " + steam.getIdGroup());
            Collections.sort(steam.getGroup());

            for (Student stud : steam.getGroup()) {
                System.out.println("\t" + stud);
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        }

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

