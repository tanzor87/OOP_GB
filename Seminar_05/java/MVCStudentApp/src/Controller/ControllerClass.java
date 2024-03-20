package Controller;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;
import Model.Domain.StudentIterator;
import Model.ModelClass;
import View.ViewClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс контроллера
 */
public class ControllerClass {
    /**
     * Ссылка на модель
     */
//    private ModelClass model;
    private iGetModel model;
    /**
     * Ссылка на View
     */
//    private ViewClass view;
    private iGetView view;

    /**
     * Буфер
     */
    private List<Student> buffer = new ArrayList<>();

    /**
     * Конструктор класса
     * @param model
     * @param view
     */
//    public ControllerClass(ModelClass model, ViewClass view) {
    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students){
        if (students.size() > 0){
            return true;
        }
        return false;
    }
    /**
     * Метод связывает Model и View
     */
    public void update(){
//        MVC
//        view.printAllStudents(model.getAllStudents());

//        MVP
        buffer = model.getAllStudents();
        if (testData(buffer)) {
            view.printAllStudents(buffer);
//            view.printAllStudentsEng(buffer);
        } else {
            System.out.println("Список студентов пуст!");
        }
    }

    /**
     * Метод позволяющий выполнять какие-либо действия со списком (например выводить список, удалять студента)
     */
    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    //MVC
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    String delName = view.nameInput("Введите имя: ");
                    buffer = model.getAllStudents();

                    Iterator<Student> it = buffer.iterator();
                    while (it.hasNext()) {
                        Student s = it.next();
                        if (s.getName().equals(delName)){
                            it.remove();
                        }
                    }
                    view.printAllStudents(buffer);
            }
        }
    }
}
