package kbtu.oop.lab1.problem5;

import java.util.Vector;
import java.util.Scanner;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople;
    
    public DragonLaunch() {
        kidnappedPeople = new Vector<Person>();
    }
    
    public void kidnap(Person p) {
        kidnappedPeople.add(p);
        System.out.println("Kidnapped: " + p.getGenderChar() + " (" + p.toString() + ")");
    }
    
    public boolean willDragonEatOrNot() {
        if (kidnappedPeople.size() == 0) {
            return false;
        }
        
        boolean found = true;
        while (found) {
            found = false;
            for (int i = 0; i < kidnappedPeople.size() - 1; i++) {
                Person current = kidnappedPeople.get(i);
                Person next = kidnappedPeople.get(i + 1);
                
                if (current.getGender() == Gender.BOY && next.getGender() == Gender.GIRL) {
                    
                    kidnappedPeople.remove(i + 1);
                    kidnappedPeople.remove(i);
                    
                    found = true;
                    break;
                }
            }
        }
        
        return kidnappedPeople.size() > 0;
    }
    
    public void displayLine() {
        System.out.print("Line: ");
        for (int i = 0; i < kidnappedPeople.size(); i++) {
            Person p = kidnappedPeople.get(i);
            System.out.print(p.getGenderChar());
        }
        System.out.println();
    }
    
    public String toString() {
        String result = "DragonLaunch{line=";
        for (int i = 0; i < kidnappedPeople.size(); i++) {
            Person p = kidnappedPeople.get(i);
            result = result + p.getGenderChar();
        }
        result = result + "}";
        return result;
    }
    
    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Dragon Launch Simulator ===");
        System.out.println("Enter B for Boy, G for Girl, Q to quit");
        
        while (true) {
            System.out.print("Enter: ");
            String input = scanner.nextLine();
            
            if (input.equals("Q") || input.equals("q")) {
                break;
            }
            
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == 'B' || c == 'b') {
                    Person p = new Person(Gender.BOY);
                    launch.kidnap(p);
                } 
                else if (c == 'G' || c == 'g') {
                    Person p = new Person(Gender.GIRL);
                    launch.kidnap(p);
                }
            }
        }
        
        System.out.println("\nInitial line:");
        launch.displayLine();
        System.out.println("Initial state: " + launch.toString());
        
        boolean willEat = launch.willDragonEatOrNot();
        
        System.out.println("\nAfter vanishing:");
        launch.displayLine();
        System.out.println("Final state: " + launch.toString());
        
        if (willEat) {
            System.out.println("Dragon will eat! There are " + 
                             launch.kidnappedPeople.size() + " students left.");
        } 
        else {
            System.out.println("Dragon will NOT eat! All students vanished!");
        }
        
        scanner.close();
    }
}