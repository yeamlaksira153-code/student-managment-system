package ui;
import model.Student ;
import java .util.Scanner;
import service.StudentService;
public class Main {
    
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
StudentService service=new StudentService();

		boolean running=true;
		while(running) {
			System.out.println("\n==============================");
	        System.out.println(" STUDENT MANAGEMENT SYSTEM");
	        System.out.println("==============================");
	        System.out.println("1. Add Student");
	        System.out.println("2. Display Students");
	        System.out.println("3. search student");
	        System.out.println("4. Exit");
	        System.out.print("Choose an option: ");
	        
	        int choice=sc.nextInt();
			sc.nextLine();
	switch(choice) {
	case 1: 
		int id;
		while(true) {
	System.out.println("enter student details to add ");
	
    System.out.print("Enter Student ID: ");
     id = sc.nextInt();
    sc.nextLine();
    if (service.studentExists(id)) {
    System.out.println("student id already exists");
    
    }else {
    	break;
    }
		}

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    int age;
    while(true) {
    System.out.print("Enter Age: ");
     age = sc.nextInt();
     
     if(age>=16 && age<=100) {
    	 break;
    	 
     }System.out.println("age must be between 16 and 100");
    sc.nextLine();
    
    }
    System.out.print("Enter Course: ");
    String course = sc.nextLine();

    double averageMark;
    while(true) {
    System.out.print("Enter Average Mark: ");
   averageMark = sc.nextDouble();
    sc.nextLine();
    
    if(averageMark>=0 && averageMark<=100) {}
    break;
    }System.out.println("average mark must be between 0 and 100");
    Student student=new Student (
    	id,name,age,course,averageMark	
    		);
    service.addStudent(student);
    System.out.println("student added successfully");
    
	break;
	case 2: System.out.println("list of students ");
	service.displayStudents();
	break;
	case 3:
		System.out.println("enter student Id");
		 int searchId=sc.nextInt();
		 sc.nextLine();
		
		 Student foundStudent=service.findStudentById(searchId);
		 if (foundStudent != null) {

		        System.out.println("\nStudent Found");
		        System.out.println(foundStudent);

		    } else {

		        System.out.println("Student not found.");

		    }

		    break;
		
	case 4: System.out.println("exiting the system ");
	running=false;
	break;
	default: System.out.println("invalid choice");
	
	
	}
			
			
			
		}
		
		
		sc.close();
	}
}
