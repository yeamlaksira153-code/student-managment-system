package model;

public class Student {
private int studentId;
private String studentName;
private int age;
private String course;
private double averageMark;


	public Student(int studentId, String studentName, int age, String course, double averageMark ) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.age=age;
		this . course=course;
		this.averageMark=averageMark;
	
		
	}
   public String getstudentName() {
	   return studentName;
	   
   }
	public int getstudentId() {
		return studentId;
	}
public int getage() {
	return age;
}

public String getcourse() {
	return course;
}
public double getaverageMark() {
	return averageMark;
}
public double setaverageMark(double average) {
	return average;
}
@Override
public String toString() {
	return "student name:"+studentName+
			"student Id :"+studentId+
			"age:"+age+
			"course :"+course+
			"average Mark:"+averageMark;
}

}
