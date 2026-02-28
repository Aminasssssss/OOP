package pr3.delivery.app;

import pr3.delivery.model.Car;
import pr3.delivery.model.Engine;
import pr3.delivery.model.Truck;
import pr3.delivery.model.Vehicle;
import pr3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

class MainApp {

	public static void main(String[] args) {
		Engine engine1=new Engine("Petrol", 150);
		Engine engine2= new Engine("Diesel", 400);
		
		System.out.println(engine1);
        System.out.println(engine2);
        System.out.println();
        
        Car car = new Car("Toyota Camry", 500, engine1, 5);
        Truck truck = new Truck("Volvo FH", 1200, engine2, 20000);

        System.out.println(car);
        System.out.println(truck);
        System.out.println();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        
        DeliveryService service = new DeliveryService();
        
        service.printAllVehicles(vehicles);
        service.calculateAllDeliveries(vehicles);
        service.calculateTotalCost(vehicles);
        
        System.out.println("Car with extra weight 50kg: " + car.calculateDeliveryCost(50));
        System.out.println("Truck with distance 200, fuel 1.5: " + truck.calculateDeliveryCost(200, 1.5));

	}

}
