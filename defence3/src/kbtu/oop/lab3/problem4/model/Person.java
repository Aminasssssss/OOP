package kbtu.oop.lab3.problem4.model;

public class Person implements Cloneable{
	protected String name;
	
	
	public Person(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
        return "Person: " + name;
    }
	
	@Override
	public boolean equals(Object object) {
		if(this==object) {
			return true;
		}
		if(object==null || getClass()!= object.getClass()) {
			return false;
		}
		
		Person person= (Person) object;
		return name.equals(person.name);
				
	}

}
