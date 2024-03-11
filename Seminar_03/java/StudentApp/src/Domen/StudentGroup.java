package Domen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


/**
 * Класс StudentGroup, содержит в себе список студентов (Student)
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private int idGroup;

    /**
     * Конструктор класса StudentGroup
     * @param group  - список студентов в группе
     * @param idGroup - ID группы
     */
    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group = " + group +
                ", idGroup = " + idGroup +
                '}';
    }

    /**
     * Метод итерирования группы
     * @return
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    /**
     * метод сортировки групп по количеству студентов в группе, по возрастанию
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(StudentGroup o) {
//        return 0;
        if (group.size() == o.getGroup().size()) {
            return 0;
        }
        if (group.size() < o.getGroup().size()) {
            return -1;
        } else {
            return 1;
        }
    }
}

