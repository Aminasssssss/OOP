package kbtu.oop.practice4.problem4.main;

import kbtu.oop.practice4.problem4.model.NameComparator;
import kbtu.oop.practice4.problem4.model.Student;
import kbtu.oop.practice4.problem4.bonus.CountingSort;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
        students.add(new Student("Zarina", 3.5));
        students.add(new Student("Aibek",  3.8));
        students.add(new Student("Marat",  3.2));

        Collections.sort(students);
        System.out.println("Sorted by GPA: " + students);

        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Name: " + students);

        int[] arr = {4, 2, 10, 1, 4, 2, 7, 0, 3};
        CountingSort cs = new CountingSort();
        cs.sort(arr);
	}

}
