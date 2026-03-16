package kbtu.oop.lab2.task1.part1;

public class TestShapes {

	public static void main(String[] args) {
		Cylinder c= new Cylinder(5, 10);
		Sphere s= new Sphere(4);
		Cube cube = new Cube(3);
		
		System.out.println("Cylinder volume: " + c.volume());
        System.out.println("Sphere volume: " + s.volume());
        System.out.println("Cube volume: " + cube.volume());
		
        System.out.println();
        System.out.println("Cylinder SA: " + c.surfaceArea());
        System.out.println("Sphere SA: " + s.surfaceArea());
        System.out.println("Cube SA: " + cube.surfaceArea());
		
		
		

	}

}
