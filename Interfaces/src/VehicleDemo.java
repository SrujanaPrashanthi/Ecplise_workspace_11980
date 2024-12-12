
public class VehicleDemo {

	public static void main(String[] args) {
		MyVechicle  bike = new MyVechicle();
		MyVechicle  car = new MyVechicle();
		MyVechicle  auto = new MyVechicle();
		
		System.out.println(bike.veh());
		System.out.println(bike.veh1());
		System.out.println(bike.veh2());
		System.out.println(bike.Break());
		System.out.println(bike.Accelator());
		System.out.println(Vehicles.signals());//static
		
		System.out.println("-------------");
		
		
		System.out.println(car.veh());
		System.out.println(car.veh1());
		System.out.println(car.veh2());
		System.out.println(car.Break());
		System.out.println(car.Accelator());
		System.out.println(Vehicles.signals());//static
		
		System.out.println("-------------");
		
		System.out.println(auto.veh());
		System.out.println(auto.veh1());
		System.out.println(auto.veh2());
		System.out.println(auto.Break());
		System.out.println(auto.Accelator());
		System.out.println(Vehicles.signals());//static

	}

}
