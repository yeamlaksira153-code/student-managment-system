package ui;

import java.util.Scanner;
import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        boolean running = true;

        while (running) {

            System.out.println("\n==============================");
            System.out.println(" STUDENT MANAGEMENT SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                int id;

                while (true) {

                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    if (service.studentExists(id)) {
                        System.out.println("Student ID already exists.");
                    } else {
                        break;
                    }

                }

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                int age;

                while (true) {

                    System.out.print("Enter Age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    if (age >= 16 && age <= 100) {
                        break;
                    }

                    System.out.println("Age must be between 16 and 100.");

                }

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                double averageMark;

                while (true) {

                    System.out.print("Enter Average Mark: ");
                    averageMark = sc.nextDouble();
                    sc.nextLine();

                    if (averageMark >= 0 && averageMark <= 100) {
                        break;
                    }

                    System.out.println("Average Mark must be between 0 and 100.");

                }

                Student student = new Student(
                        id,
                        name,
                        age,
                        course,
                        averageMark);

                service.addStudent(student);

                System.out.println("Student added successfully!");

                break;

            case 2:

                service.displayStudents();

                break;

            case 3:

                System.out.print("Enter Student ID: ");

                int searchId = sc.nextInt();
                sc.nextLine();

                Student foundStudent = service.findStudentById(searchId);

                if (foundStudent != null) {

                    System.out.println("\nStudent Found");
                    System.out.println(foundStudent);

                } else {

                    System.out.println("Student not found.");

                }

                break;

            case 4:

                System.out.print("Enter Student ID to update: ");

                int updateId = sc.nextInt();
                sc.nextLine();

                Student studentToUpdate = service.findStudentById(updateId);

                if (studentToUpdate == null) {

                    System.out.println("Student not found.");

                    break;

                }

                System.out.print("Enter New Name: ");
                String newName = sc.nextLine();

                System.out.print("Enter New Age: ");
                int newAge = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Course: ");
                String newCourse = sc.nextLine();

                System.out.print("Enter New Average Mark: ");
                double newMark = sc.nextDouble();
                sc.nextLine();

                studentToUpdate.setStudentName(newName);
                studentToUpdate.setAge(newAge);
                studentToUpdate.setCourse(newCourse);
                studentToUpdate.setAverageMark(newMark);

                System.out.println("Student updated successfully!");

                break;

            case 5:

                running = false;

                System.out.println("Goodbye!");

                break;

            default:

                System.out.println("Invalid choice.");

            }

        }

        sc.close();

    }

}