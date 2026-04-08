package kbtu.oop.lab3.problem4.app;

import kbtu.oop.lab3.problem4.model.*;
import java.util.Date;
import java.util.Vector;

public class TestProblem4 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws CloneNotSupportedException {
		
        Employee a = new Employee("Alice", 50000, new Date(2020, 0, 1), "INS1");
        Employee b = new Employee("Bob", 60000, new Date(2019, 5, 15), "INS2");
        Employee c = new Employee("Charlie", 55000, new Date(2021, 2, 10), "INS3");

        Manager m = new Manager("David", 80000, new Date(2018, 3, 20), "INS4", 10000);
        m.addToTeam(a);
        m.addToTeam(b);
        m.addToTeam(c);

        System.out.println("toStrings: ");
        System.out.println(a);
        System.out.println(m);

        System.out.println("\nequals: ");
        Employee a2 = new Employee("Alice", 50000, new Date(2020, 0, 1), "INS1");
        System.out.println("Alice equals copy: " + a.equals(a2));

        System.out.println("\nComparable: ");
        System.out.println("Alice (50000) vs Bob (60000): " + a.compareTo(b));
        
        Manager m3 = new Manager("Eve", 60000, new Date(2022, 0, 1), "INS5", 5000);
        System.out.println("Bob (60000) vs Eve (Manager with 60000): " + b.compareTo(m3));

        System.out.println("\nNameComparator:");
        Vector<Employee> list = new Vector<>();
        list.add(b); list.add(c); list.add(a); list.add(m);
        
        System.out.print("Before: ");
        for (Employee e : list) System.out.print(e.getName() + " ");
        System.out.println();
        
        list.sort(new NameComparator());
        System.out.print("After:  ");
        for (Employee e : list) System.out.print(e.getName() + " ");
        System.out.println();

        System.out.println("\nHireDateComparator:");
        System.out.print("Before: ");
        for (Employee e : list) System.out.print(e.getName() + " ");
        System.out.println();
        
        list.sort(new HireDateComparator());
        System.out.print("After:  ");
        for (Employee e : list) System.out.print(e.getName() + " ");
        System.out.println();

        System.out.println("\nEdge cases: ");
        Vector<Employee> empty = new Vector<>();
        empty.sort(new NameComparator());
        empty.sort(new HireDateComparator());
        System.out.println("Empty list sorting: OK (no crash)");


        System.out.println("\nDeep clone:");
        Manager m2 = m.clone();
        System.out.println("Original team size: " + m.getTeam().size());
        System.out.println("Cloned team size: " + m2.getTeam().size());
        
        m.getTeam().remove(0);
        System.out.println("\nAfter removing from original:");
        System.out.println("Original team size: " + m.getTeam().size());
        System.out.println("Cloned team size: " + m2.getTeam().size());
        
    }

}
