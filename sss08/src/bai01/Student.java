package bai01;

public class Student extends Person {
    private String studentId;
    private double gpa;

    public Student() {
    }

    public Student(String fullName, int age, String studentId, double gpa) {
        super(fullName, age);   // gọi constructor Person
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();   // dùng lại Person
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + gpa);
    }
}

