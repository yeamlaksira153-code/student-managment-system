package service;
import java.util.ArrayList;
import model.Student;
public class StudentService {
ArrayList<Student>students;


	public StudentService() {
		students=new ArrayList<>();
	}
   public void addstudent(Student student) {
	   students.add(student);
   }
public void displaystudents() {
 	for(Student st:students) {
 		
 		System.out.println(st);
 	}
	
}
}
