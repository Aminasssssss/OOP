package kbtu.oop.lab2.task5;

public class PhDStudent extends Student{
private String researchTopic;
    
    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }
    
    @Override
    public String getOccupation() {
        return researchTopic;
    }
    
    @Override
    public boolean canHavePet(Animal pet) {
        
        if (pet instanceof Dog) {
            return false;  
        }
        return true;
    }

}
