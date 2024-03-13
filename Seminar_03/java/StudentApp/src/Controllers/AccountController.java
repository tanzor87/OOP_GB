package Controllers;

import Domen.Person;
import java.util.List;

public class AccountController {
    public <V extends Person> void print(List<V> group) {
        for (V person : group){
            System.out.println(person);
        }
    }
}
