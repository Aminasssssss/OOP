package kbtu.oop.lab3.problem5.app;
import java.util.Arrays;

import kbtu.oop.lab3.problem4.model.Employee;
import kbtu.oop.lab3.problem5.model.*;



public class SortTest {
	
	@SuppressWarnings("deprecation")
    public static void main(String[] args) {
        
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50),
            new Chocolate("Snickers", 80),
            new Chocolate("Mars", 60),
            new Chocolate("Bounty", 45)
        };
        System.out.println("Original: " + Arrays.toString(chocolates));
        Sort.bubbleSort(chocolates);
        System.out.println("Bubble sorted: " + Arrays.toString(chocolates));
        
        Time[] times = {
            new Time(14, 30, 0),
            new Time(9, 15, 30),
            new Time(23, 59, 59),
            new Time(9, 15, 29)
        };
        System.out.println("\nOriginal: " + Arrays.toString(times));
        Sort.mergeSort(times);
        System.out.println("Merge sorted: " + Arrays.toString(times));
        
        Employee[] employees = {
            new Employee("Alice", 50000, new java.util.Date(2020, 0, 1), "INS1"),
            new Employee("Bob", 70000, new java.util.Date(2019, 5, 15), "INS2"),
            new Employee("Charlie", 60000, new java.util.Date(2021, 2, 10), "INS3")
        };
        System.out.println("\nOriginal: " + Arrays.toString(employees));
        Sort.mergeSort(employees);
        System.out.println("Sorted: " + Arrays.toString(employees));
    }

}
