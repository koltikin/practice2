package practice;

public class Student extends Person {
    private String school_name;
    private int student_id;
    public Student(String name, int age, String school_name, int student_id) {
        super(name, age);
        this.student_id = student_id;
        this.school_name = school_name;
    }
}
