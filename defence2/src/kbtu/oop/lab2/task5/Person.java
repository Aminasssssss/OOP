package kbtu.oop.lab2.task5;

import java.util.Objects;

public abstract class Person {
	private String name;
	private int age;
	private Animal pet;
	private Animal tempPet;

	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		this.pet=null;
		this.tempPet=null;
	}
	
	public boolean canHavePet(Animal Pet) {
		return true;
	}
	
	public abstract String getOccupation();
	
	
	public void assignPet(Animal pet) {
		if(canHavePet(pet)==true) {
			this.pet=pet;
			
		}
	}
	
	
	public void removePet() {
		this.pet=null;
	}
	public boolean hasPet() {
		return pet!=null;
	}
	
	public void leavePetWith(Person other) {
        if (this.pet == null) {
            System.out.println(name + " doesn't have a pet to leave");
            return;
        }
        if (!other.canHavePet(this.pet)) {
            System.out.println(other.name + " cannot take care of " + this.pet.getName());
            return;
        }
        if (other.pet != null || other.tempPet != null) {
            System.out.println(other.name + " already has a pet");
            return;
        }
        
        other.tempPet = this.pet;
        this.pet = null;
        System.out.println(name + " left " + other.tempPet.getName() + " with " + other.name);
    }
	
	
	
	public void retrievePetFrom(Person other) {
        if (other.tempPet == null) {
            System.out.println(other.name + " has no pet to return");
            return;
        }
        
        this.pet = other.tempPet;
        other.tempPet = null;
        System.out.println(name + " retrieved " + this.pet.getName() + " from " + other.name);
    }
	
	 @Override
	    public boolean equals(Object object) {
	        if (this == object)
	        	return true;
	        if (object == null || getClass() != object.getClass()) 
	        	return false;
	        
	        Person person = (Person) object;
	        
	        return age == person.age && Objects.equals(name, person.name);
	    }
	    
	    @Override
	    public int hashCode() {
	        return Objects.hash(name, age);
	    }
	
	
	
	
}
