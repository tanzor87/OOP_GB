package Controller;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

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
    private iGetView viewEng;
    /**
     * Буфер
     */
    private List<Student> buffer = new ArrayList<>();

    /**
     * Конструктор класса для инециализации Controller с сылками на классы Model и View
     * @param model
     * @param view
     */
//    public ControllerClass(ModelClass model, ViewClass view) {
    public ControllerClass(iGetModel model, iGetView view, iGetView viewEng) {
        this.model = model;
        this.view = view;
        this.viewEng = viewEng;
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
            System.out.println("Список Команд:\n" +
                    "list - список студентов\n" +
                    "listEng - список студентов на английском\n" +
                    "delete - удаление студентов из списка\n" +
                    "exit -  Выход из программы\n");
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
                case LISTENG:
                    viewEng.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    int delID = Integer.parseInt(view.prompt("Введите ID студента: "));
                    if (model.deleteStudent(delID)){
                        System.out.println("Студент с ID {" + delID +
                                "} удален!"
                                );
                    } else {
                        System.out.println("Студент с ID {" + delID +
                                "} отсутсвует в списке!"
                        );
                    }
                    break;
            }
        }
    }
}
