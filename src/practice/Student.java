package practice;

public class Student extends Person {
    private final String school_name = "CYDEO";
    private int student_id;

    public Student(String name, int age, int student_id) {
        super(name, age);
        this.student_id = student_id;
    }
}
