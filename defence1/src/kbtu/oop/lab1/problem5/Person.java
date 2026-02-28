package kbtu.oop.lab1.problem5;

public class Person {
    private Gender gender;
    
    public Person(Gender gender) {
        this.gender = gender;
    }
    
    public Gender getGender() {
        return gender;
    }
    
    public char getGenderChar() {
        if (gender == Gender.BOY) {
            return 'B';
        } 
        else {
            return 'G';
        }
    }
    
    public String toString() {
        return "Person{gender=" + gender + "}";
    }
}