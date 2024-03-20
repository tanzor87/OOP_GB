package Model.Domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
    private int count;
    private List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    @Override
    public Student next() {
        return students.get(count++);
    }
}
