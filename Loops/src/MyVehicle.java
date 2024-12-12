
public abstract class MyVehicle implements Vehicle {
	public void start() {
		System.out.println("Start...");
	}
	
	public void move() {
		System.out.println("move...");
	}
	public abstract void stop();
	public abstract void noOfWheels();

}
