package kbtu.oop.lab2.task5;

public class Student extends Person{
	 private String major;
	    
	    public Student(String name, int age, String major) {
	        super(name, age);
	        this.major = major;
	    }
	    
	    @Override
	    public String getOccupation() {
	        return major;
	    }
}
