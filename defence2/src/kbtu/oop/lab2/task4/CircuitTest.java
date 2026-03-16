package kbtu.oop.lab2.task4;

public class CircuitTest {

	public static void main(String[] args) {
		Circuit r1 = new Registor(7.0);
        Circuit r2 = new Registor(10.0);
        Circuit r3 = new Registor(6.0);
        Circuit r4 = new Registor(4.0);
        
        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);
        
        double R = circuit.getResistance();
        System.out.println("Equivalent resistance = " + R + " ohms");
        
        circuit.applyPotentialDiff(12.0);
        System.out.println("Current = " + circuit.getCurrent() + " A");
        System.out.println("Power = " + circuit.getPower() + " W");
	}

}
