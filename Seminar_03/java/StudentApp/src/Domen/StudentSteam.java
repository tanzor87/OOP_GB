package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroups;
    private int idSteam;


    public StudentSteam(List<StudentGroup> studentGroups, int idSteam) {
        this.studentGroups = studentGroups;
        this.idSteam = idSteam;
    }


    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public int getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(int idSteam) {
        this.idSteam = idSteam;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "studentGroups=" + studentGroups +
                ", idSteam=" + idSteam +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(studentGroups);
    }
}
