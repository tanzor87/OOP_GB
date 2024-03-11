package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int count;
    private List<StudentGroup> groups;

    public StudentGroupIterator(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    public StudentGroup next() {
        return groups.get(count++);
    }
}
