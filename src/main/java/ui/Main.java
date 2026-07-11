package ui;
import model.Student ;
import java .util.Scanner;
import service.StudentService;
public class Main {
    
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
StudentService service=new StudentService();
Student student1= new Student(
	1234 ,"jhon",22,"computer science",88.2
		);
		
Student student2 = new Student(
	2345 ,"lily",21,"software development",99);
			
		service.addstudent(student1);
		service.addstudent(student2);
		service.displaystudents();
		
		boolean running=true;
		while(running) {
			System.out.println("\n==============================");
	        System.out.println(" STUDENT MANAGEMENT SYSTEM");
	        System.out.println("==============================");
	        System.out.println("1. Add Student");
	        System.out.println("2. Display Students");
	        System.out.println("3. Exit");
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

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Course: ");
    String course = sc.nextLine();

    System.out.print("Enter Average Mark: ");
    double averageMark = sc.nextDouble();
    sc.nextLine();
	
    Student student=new Student (
    	id,name,age,course,averageMark	
    		);
    service.addstudent(student);
    System.out.println("student added successfully");
    
	break;
	case 2: System.out.println("list of students ");
	service.displaystudents();
	break;
	case 3: System.out.println("exiting the system ");
	running=false;
	break;
	default: System.out.println("invalid choice");
	
	
	}
			
			
			
		}
		
		
		sc.close();
	}
}
