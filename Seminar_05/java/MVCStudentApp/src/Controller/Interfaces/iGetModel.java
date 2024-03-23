package Controller.Interfaces;

import Model.Domain.Student;

import java.util.List;

public interface iGetModel {
    public List<Student> getAllStudents();
    public boolean deleteStudent(Integer studentId);

}
