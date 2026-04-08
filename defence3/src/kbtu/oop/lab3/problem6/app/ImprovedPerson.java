package kbtu.oop.lab3.problem6.app;

import kbtu.oop.lab2.task5.Person;
import kbtu.oop.lab3.problem6.model.Workable;

public class ImprovedPerson extends Person implements Comparable<ImprovedPerson>, Cloneable, Workable {
    private String task;
    
    public ImprovedPerson(String name, int age, String task) {
        super(name, age);
        this.task = task;
    }
    
    @Override
    public String getOccupation() {
        return "Worker";
    }
    
    @Override
    public int compareTo(ImprovedPerson other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
    
    @Override
    public ImprovedPerson clone() {
        try {
            return (ImprovedPerson) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void work() {
        System.out.println(getName() + " is working on: " + task);
    }
    
    @Override
    public String getTask() {
        return task;
    }
    
    @Override
    public String toString() {
        return getName() + " (" + getAge() + " years, occupation: " + getOccupation() + ")";
    }
}