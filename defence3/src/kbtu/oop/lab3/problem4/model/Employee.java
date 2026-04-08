package kbtu.oop.lab3.problem4.model;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
	protected double salary;
	protected Date hireDate;
	protected String insuranceNumber;
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		
		this.salary=salary;
		this.hireDate=hireDate;
		this.insuranceNumber=insuranceNumber;
	}
	
	public double getSalary() { 
		return salary; 
	}
    public void setSalary(double salary) {
    	this.salary = salary; 
    }
    public Date getHireDate() { 
    	return hireDate; 
    }
    public String getInsuranceNumber() { 
    	return insuranceNumber; 
    }

    @Override
    public String toString() {
        return name + " => salary: " + salary + ", hired: " + hireDate + ", insurance: " + insuranceNumber;
    }
    
    @Override
    public boolean equals(Object object) {
    	if(this==object) {
    		return true;
    	}
    	if(object==null || getClass()!=object.getClass()) {
    		return false;
    	}
    	Employee employee=(Employee) object;
    	return salary==employee.salary && hireDate.equals(employee.hireDate) && insuranceNumber.equals(employee.insuranceNumber);
    }
    
    
    @Override 
    public int compareTo(Employee other) {
    	return Double.compare(this.salary, other.salary);
    }
    
    
    @Override 
    public Employee clone() throws CloneNotSupportedException {
    	try {
    		Employee cloned = (Employee) super.clone();
            cloned.hireDate = (Date) this.hireDate.clone();
            return cloned;
    	}
    	catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    		
    }

    

}
