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
public boolean studentExists(int studentId) {
	for(Student student :students) {
if(students.getstudentId()==studentId) {
	return true;
}
		
	}
	

	
}

}
