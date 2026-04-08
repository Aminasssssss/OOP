package kbtu.oop.lab3.problem6.app;

import kbtu.oop.lab2.task5.Animal;
import kbtu.oop.lab3.problem6.model.Feedable;

public class ImprovedAnimal extends Animal implements Comparable<ImprovedAnimal>, Cloneable, Feedable {
    private String favoriteFood;
    private boolean hungry;
    
    public ImprovedAnimal(String name, int age, String sound, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
        this.hungry = true;
    }
    
    @Override
    public String getSound() {
        return "Some sound";
    }
    
    @Override
    public int compareTo(ImprovedAnimal other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
    
    @Override
    public ImprovedAnimal clone() {
        try {
            return (ImprovedAnimal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void feed(String food) {
        if (food.equals(favoriteFood)) {
            System.out.println(getName() + " eats " + food + " happily!");
            hungry = false;
        } else {
            System.out.println(getName() + " ignores " + food);
        }
    }
    
    @Override
    public boolean isHungry() {
        return hungry;
    }
    
    @Override
    public String toString() {
        return getName() + " (" + getAge() + " years, fav food: " + favoriteFood + ")";
    }
}