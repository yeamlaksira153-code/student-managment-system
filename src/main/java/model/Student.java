package model;

public class Student {

    private int studentId;
    private String studentName;
    private int age;
    private String course;
    private double averageMark;

    public Student(int studentId, String studentName, int age,
                   String course, double averageMark) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.course = course;
        this.averageMark = averageMark;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                "\nStudent Name: " + studentName +
                "\nAge: " + age +
                "\nCourse: " + course +
                "\nAverage Mark: " + averageMark;
    }
}