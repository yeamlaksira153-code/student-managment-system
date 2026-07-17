package service;

import java.util.ArrayList;
import model.Student;
import java.io.FileWriter;
import java.io.IOException;
public class StudentService {

    private ArrayList<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
   
    public void displayStudents() {
    	
    	if(students.isEmpty()) {
    		System.out.println("student not foiund");
    	}
        for (Student st : students) {
            System.out.println(st);
        }
    }
    public boolean studentExists(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return true;
            }
        }
        return false;
    }
    
    public Student findStudentById(int studentId) {
   for(Student student :students) {
	   if(student.getStudentId()==studentId) {
		   return student;
	   }
	   
   }
   
   return null;
    }
    
    public boolean deleteStudent(int studentId) {

        Student student = findStudentById(studentId);

        if (student != null) {

            students.remove(student);

            return true;
        }

        return false;
    }
    
    public void saveStudent() {
    	
    	try {
    		FileWriter writer = new FileWriter("student.txt");
    		for(Student student:students) {
    			
    writer.write(student.toString());
    		}writer.close();
    		
    	}catch(IOException e) {
    		System.out.println("error saving student");
    	}
    }    		

}

