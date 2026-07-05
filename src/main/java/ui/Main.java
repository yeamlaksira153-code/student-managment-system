package ui;
import model.Student ;
import service.StudentService;
public class Main {
    
	
	public static void main(String[] args) {
StudentService service=new StudentService();

Student student1= new Student(
	1234 ,"jhon",22,"computer science",88.2
		);
		
	Student student2 = new Student(
			2345 ,"lily",21,"software development",99);
			
		service.addstudent(student1);
		service.addstudent(student2);
		service.displaystudents();
	}

}
