package kbtu.oop.lab1.problem5;

public class Person {
	private int gender;
    
    public Person(int gender) {
        if (gender == Gender.BOY || gender == Gender.GIRL) {
            this.gender = gender;
        } 
        else {
            this.gender = Gender.BOY;
        }
    }
    
    
    public int getGender() {
        return gender;
    }
    
    public char getGenderChar() {
        if (gender == Gender.BOY) {
            return 'B';
        } else {
            return 'G';
        }
    }
    
    public String toString() {
        if (gender == Gender.BOY) {
            return "Person{gender=BOY}";
        } else {
            return "Person{gender=GIRL}";
        }
    }
	

}
