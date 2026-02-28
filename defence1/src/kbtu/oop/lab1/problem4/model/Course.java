package kbtu.oop.lab1.problem4.model;

public class Course {
	private String name;
	private String description;
	private int credits;
	private String prerequisites; //  List<Course>
	
	public Course() {
		this.name="Unknown Course";
		this.description="";
		this.credits=3;
		this.prerequisites="None";
		
	}
	
	public Course(String name, String description, int credits, String prerequisites) {
		this.name=name;
		this.description=description;
		this.credits=credits;
		this.prerequisites=prerequisites;
		
	}
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getCredits() {
		return credits;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	
	public String toString() { 
		return "Course{name=" + name + ", description=" + description + ", credits=" + credits + ", prerequisites=" + prerequisites + "}";
	}
	

}
