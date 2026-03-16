package kbtu.oop.lab2.task5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
	
	private List<Person> people;
    
    public PersonRegistry() {
        people = new ArrayList<>();
    }
    
    public void addPerson(Person p) {
        people.add(p);
    }
    
    public List<Person> findPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }
    
    public List<Person> findPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (!p.hasPet()) {
                result.add(p);
            }
        }
        return result;
    }

}
