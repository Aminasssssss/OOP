package kbtu.oop.lab1.problem3;

public class TemperatureTest {

	public static void main(String[] args) {
		Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(25);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(100, 'F');
        Temperature t5 = new Temperature(37.5, 'C');
        Temperature t6 = new Temperature(0, 'K');
        
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        System.out.println("t3: " + t3);
        System.out.println("t4: " + t4);
        System.out.println("t5: " + t5);
        System.out.println("t6 (invalid scale): " + t6);
        
        System.out.println("\nConversions");
        Temperature freezing = new Temperature(0, 'C');
        Temperature boiling = new Temperature(212, 'F');
        
        System.out.println(freezing + " = " + freezing.getFahrenheit() + "°F");
        System.out.println(boiling + " = " + boiling.getCelsius() + "°C");
        
        System.out.println("\nSetters");
        Temperature t = new Temperature(20, 'C');
        System.out.println("Before: " + t);
        
        t.setValue(30);
        System.out.println("After setValue(30): " + t);
        
        t.setScale('F');
        System.out.println("After setScale('F'): " + t);
        
        t.setBoth(75, 'C');
        System.out.println("After setBoth(75, 'C'): " + t);

	}

}
