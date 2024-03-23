package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileModelClass implements iGetModel {
    private String fileName;

    public FileModelClass(String fileName) {
        this.fileName = fileName;
        try(FileWriter fw = new FileWriter(fileName, true)){
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students  = new ArrayList<Student>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]));
                students.add(pers);
                line = reader.readLine();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }

    @Override
    public boolean deleteStudent(String studentName) {
        return false;
    }
}
