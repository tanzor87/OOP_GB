package Model.Domain;

public class Student extends Person implements Comparable<Student> {
    private int id;
    private static int generalId;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id + "," +
                " Name: " + super.getName() + "," +
                " Age: " + super.getAge() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        System.out.println(super.getName() + " " + o.getName());
        if (o.getAge() == super.getAge()){
//            return 0;
            if (id == o.id) {
                return 0;
            }
            if (id > o.id) {
                return 1;
            } else {
                return -1;
            }
        }
        if (o.getAge() > super.getAge()){
            return -1;
        } else {
            return 1;
        }
    }
}
