package kbtu.oop.lab1.problem4.app;

import kbtu.oop.lab1.problem4.model.Course;
import kbtu.oop.lab1.problem4.service.GradeBook;
import training2.Student2;  
import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        
        Course cs101 = new Course(
            "Object-oriented Programming and Design",
            "Introduction to OOP and Java",
            3,
            "CS100"
        );
        
       
        GradeBook gradeBook = new GradeBook(cs101, 10);
        
        gradeBook.displayMessage();
        
        System.out.println("Please, input grades for students:");
        
        char[] studentLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + studentLetters[i] + ": ");
            String input = scanner.nextLine();
            
            boolean isNumber = true;
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if (c < '0' || c > '9') {
                    isNumber = false;
                    break;
                }
            }
            
            if (isNumber) {
                int grade = Integer.parseInt(input);
                if (grade >= 0 && grade <= 100) {
                    Student2 student = new Student2("Student " + studentLetters[i], "S" + (i+1));
                    gradeBook.addStudentGrade(student, grade);
                    System.out.println("Added: " + student.toString());
                } else {
                    System.out.println("Grade must be between 0 and 100. Try again.");
                    i--;
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                i--;
            }
        }
        
        gradeBook.displayGradeReport();
        System.out.println("\nGradeBook info: " + gradeBook.toString());
        
        scanner.close();
    }
		

	

}
