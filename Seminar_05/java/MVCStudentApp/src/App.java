import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;
import Model.FileModelClass;
import Model.ModelClass;
import Model.ModelClassHash;
import View.ViewClass;
import View.ViewClassEng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 22);
        Student student2 = new Student("Oleg", 23);
        Student student3 = new Student("Petr", 20);
        Student student4 = new Student("Ira", 21);
        Student student5 = new Student("Olga", 22);
        Student student6 = new Student("Max", 22);
        Student student7 = new Student("Dima", 21);
        Student student8 = new Student("Viktor", 23);
        Student student9 = new Student("Sergey", 21);

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);


//        ModelClass model = new ModelClass(studentList);
//        ViewClass view = new ViewClass();
//        ControllerClass controller = new ControllerClass(model, view);
//        controller.run();

        /*
        FileModelClass fmodel = new FileModelClass("StudentDB.csv");
//        fmodel.saveAllStudentToFile(studentList);

//        ModelClass model = new ModelClass(studentList);
//        ViewClass view = new ViewClass();

        iGetModel model = new ModelClass(studentList);
        iGetView view = new ViewClass();

//        ControllerClass controller = new ControllerClass(model, view);
        ControllerClass controller = new ControllerClass(fmodel, view);
//        controller.update();
        controller.run();

         */

//        iGetModel model = new ModelClass(studentList);
//        iGetView view = new ViewClassEng();
//
//        ControllerClass controller = new ControllerClass(model, view);
//        controller.update();

        HashMap<Integer, Student> studentsHas = new HashMap<>();
        ModelClassHash modelHash = new ModelClassHash(studentList, studentsHas);

//        for (Map.Entry<Integer, Student> s : modelHash){
//
//        }


    }
}
