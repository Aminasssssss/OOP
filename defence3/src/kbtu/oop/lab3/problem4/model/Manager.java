package kbtu.oop.lab3.problem4.model;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Cloneable{
	
	
	private Vector<Employee> team;
	private double bonus;
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
		super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
	}
	
	public void addToTeam(Employee employee) {
		team.add(employee);
	}
	
    public Vector<Employee> getTeam() { 
    	return team; 
    }
    
    public double getBonus() { 
    	return bonus; 
    }
    
    public void setBonus(double bonus) { 
    	this.bonus = bonus; 
    }


    @Override
    public String toString() {
        return name + " => salary: " + salary + ", bonus: " + bonus + ", team size: " + team.size();
    }
    
    @Override
    public boolean equals(Object object) {
    	if(this==object) {
    		return true;
    	}
    	if(object==null || object.getClass()!=getClass()) {
    		return false;
    	}
    	
    	
    	Manager manager= (Manager) object;
    	
    	return bonus==manager.bonus && team.equals(manager.team);
    }
    
    @Override
    public int compareTo(Employee other) {
    	if(!(other instanceof Manager)) {
    		return super.compareTo(other);
    	}
    	Manager manager=(Manager) other;
    	
    	if(this.salary!=manager.salary) {
    		return Double.compare(this.salary, manager.salary);
    	}
    	return Double.compare(this.bonus, manager.bonus);
    	
    }
    
    @Override
    public Manager clone() throws CloneNotSupportedException{
    	try {
    		Manager cloned= (Manager) super.clone();
    		cloned.team= new Vector<>();
    		
    		for(Employee e: this.team) {
    			cloned.team.add(e.clone());
    		}
    		return cloned;
    	}
    	catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    
    
    
    
    

}
