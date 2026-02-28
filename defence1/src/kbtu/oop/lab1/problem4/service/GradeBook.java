package kbtu.oop.lab1.problem4.service;

import kbtu.oop.lab1.problem4.model.Course;
import training2.Student2;

public class GradeBook {
    private Course course;
    private Student2[] students;
    private int[] grades;
    private int studentCount;
    
    public GradeBook() {
        this.course = new Course();
        this.students = new Student2[50];
        this.grades = new int[50];
        this.studentCount = 0;
    }
    
    public GradeBook(Course course, int maxStudents) {
        this.course = course;
        this.students = new Student2[maxStudents];
        this.grades = new int[maxStudents];
        this.studentCount = 0;
    }
    
    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
        System.out.println(course.toString());
        System.out.println();
    }
    
    public void addStudentGrade(Student2 student, int grade) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            grades[studentCount] = grade;
            student.setGrade(grade);
            studentCount++;
        } 
        else {
            System.out.println("GradeBook is full!");
        }
    }
    
    private double determineClassAverage() {
        if (studentCount == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int i = 0; i < studentCount; i++) {
            sum = sum + grades[i];
        }
        return (double) sum / studentCount;
    }
    
    private int findBestGradeIndex() {
        int bestIndex = 0;
        for (int i = 1; i < studentCount; i++) {
            if (grades[i] > grades[bestIndex]) {
                bestIndex = i;
            }
        }
        return bestIndex;
    }
    
    private int findLowestGradeIndex() {
        int lowestIndex = 0;
        for (int i = 1; i < studentCount; i++) {
            if (grades[i] < grades[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
    
    private void outputBarChart() {
        int[] frequency = new int[11];
        
        for (int i = 0; i < studentCount; i++) {
            int grade = grades[i];
            if (grade == 100) {
                frequency[10] = frequency[10] + 1;
            } 
            else {
                frequency[grade / 10] = frequency[grade / 10] + 1;
            }
        }
        
        System.out.println("Grades:");
        
        System.out.print("00-09: ");
        for (int i = 0; i < frequency[0]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("10-19: ");
        for (int i = 0; i < frequency[1]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("20-29: ");
        for (int i = 0; i < frequency[2]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("30-39: ");
        for (int i = 0; i < frequency[3]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("40-49: ");
        for (int i = 0; i < frequency[4]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("50-59: ");
        for (int i = 0; i < frequency[5]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("60-69: ");
        for (int i = 0; i < frequency[6]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("70-79: ");
        for (int i = 0; i < frequency[7]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("80-89: ");
        for (int i = 0; i < frequency[8]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("90-99: ");
        for (int i = 0; i < frequency[9]; i++) 
            System.out.print("*");
        System.out.println();
        
        System.out.print("100: ");
        for (int i = 0; i < frequency[10]; i++) 
            System.out.print("*");
        System.out.println();
    }
    
    public void displayGradeReport() {
        if (studentCount == 0) {
            System.out.println("No students in the gradebook.");
            return;
        }
        
        System.out.println("\nGRADE REPORT");
        
        double average = determineClassAverage();
        System.out.println("Class average is " + average);
        
        int bestIndex = findBestGradeIndex();
        int lowestIndex = findLowestGradeIndex();
        
        System.out.println("Lowest grade is " + grades[lowestIndex] +  " (" + students[lowestIndex].getName() + ", id: " + students[lowestIndex].getId() + ")");
        
        System.out.println("Highest grade is " + grades[bestIndex] + " (" + students[bestIndex].getName() + ", id: " + students[bestIndex].getId() + ")");
        
        outputBarChart();
    }
    
    public String toString() {
        String result = "GradeBook{course=" + course.getName() + ", students=[";
        
        for (int i = 0; i < studentCount; i++) {
            result = result + students[i].getName() + "(" + grades[i] + ")";
            if (i < studentCount - 1) {
                result = result + ", ";
            }
        }
        result = result + "]}";
        return result;
    }
}