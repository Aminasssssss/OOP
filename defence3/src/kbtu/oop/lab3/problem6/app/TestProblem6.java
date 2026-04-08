package kbtu.oop.lab3.problem6.app;

public class TestProblem6 {
    public static void main(String[] args) {
        
        ImprovedPerson ip1 = new ImprovedPerson("Alice", 25, "coding");
        ImprovedPerson ip2 = new ImprovedPerson("Bob", 30, "testing");
        
        System.out.println("Compare by age (25 vs 30): " + ip1.compareTo(ip2));
        
        ImprovedPerson ip3 = ip1.clone();
        System.out.println("Clone of Alice: " + ip3);
        
        ip1.work();
        System.out.println("Task: " + ip1.getTask());
        
        ImprovedAnimal ia1 = new ImprovedAnimal("Buddy", 3, "Woof", "bone");
        ImprovedAnimal ia2 = new ImprovedAnimal("Whiskers", 5, "Meow", "fish");
        
        System.out.println("Compare by age (3 vs 5): " + ia1.compareTo(ia2));
        
        ImprovedAnimal ia3 = ia1.clone();
        System.out.println("Clone of Buddy: " + ia3);
        
        System.out.println("Hungry? " + ia1.isHungry());
        ia1.feed("bone");
        System.out.println("After feeding, hungry? " + ia1.isHungry());
        ia1.feed("fish");
        
    }
}
