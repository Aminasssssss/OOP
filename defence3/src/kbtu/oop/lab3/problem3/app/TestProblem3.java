package kbtu.oop.lab3.problem3.app;
import kbtu.oop.lab3.problem3.model.*;

public class TestProblem3 {
	public static void main(String[] args) {
        System.out.println("=== MyCollection Test ===\n");
        
        MyCollection<String> coll = new MyArrayList<>();
        
        coll.add("Apple");
        coll.add("Banana");
        coll.add("Cherry");
        
        System.out.println("Size: " + coll.size());
        System.out.println("Contains 'Banana': " + coll.contains("Banana"));
        System.out.println("Contains 'Grape': " + coll.contains("Grape"));
        
        System.out.print("Elements: ");
        for (Object o : coll.toArray()) {
            System.out.print(o + " ");
        }
        System.out.println();
        
        coll.remove("Banana");
        System.out.println("\nAfter removing 'Banana':");
        System.out.println("Size: " + coll.size());
        System.out.print("Elements: ");
        for (Object o : coll.toArray()) {
            System.out.print(o + " ");
        }
        System.out.println();
        
        MyCollection<String> other = new MyArrayList<>();
        other.add("Date");
        other.add("Elderberry");
        
        coll.addAll(other);
        System.out.println("\nAfter addAll:");
        System.out.print("Elements: ");
        for (Object o : coll.toArray()) {
            System.out.print(o + " ");
        }
        System.out.println();
        
        coll.clear();
        System.out.println("\nAfter clear, size: " + coll.size());
        System.out.println("Is empty: " + coll.isEmpty());
        
    }

}
