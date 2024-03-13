package Services;

import Domen.Person;
import Domen.Student;
import java.util.List;

public interface IPersonService<T extends Person> {
    List<T> getAll();
    void create(String name, int age);

//    void print(List<T> group);
}
