package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentSteam содержащий в себе список учебных групп(StudentGroup)
 */
public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroups;
    private int idSteam;

    /**
     * Конструктор класса
     * @param studentGroups - список студенческих групп
     * @param idSteam - ID потока
     */
    public StudentSteam(List<StudentGroup> studentGroups, int idSteam) {
        this.studentGroups = studentGroups;
        this.idSteam = idSteam;
    }

    /**
     * Метод получения студенческих групп
     * @return студенческие группы
     */
    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    /**
     * Метод установки студенческих групп
     * @param studentGroups
     */
    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    /**
     * Метод получения ID потока
     * @return ID потока
     */
    public int getIdSteam() {
        return idSteam;
    }

    /**
     * Метод установки ID потока
     * @param idSteam устанавливает ID потока
     */
    public void setIdSteam(int idSteam) {
        this.idSteam = idSteam;
    }

    /**
     * Метод переопределения toString
     * @return печатает ID потока и список студентов в группе
     */
    @Override
    public String toString() {
        return "StudentSteam{" +
                "idSteam=" + idSteam +
                ", studentGroups=" + studentGroups +
                '}';
    }

    /**
     * Метод итерирования по группам в мотоке
     * @return
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(studentGroups);
    }
}
