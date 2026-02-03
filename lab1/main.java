package test;

public class main {

	public static void main(String[] args) {
		Car car1=new Car("Tayota", 2020);
		System.out.println(car1.model);
		
		Car car2= new Car("BMW", 2023);
		car2.honk();
		
	}

}
