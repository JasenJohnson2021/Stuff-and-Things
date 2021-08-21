package jasen.model;

public class FlyingVehicle extends Vehicle {
	
	private short wings;
	private Engine engine;
	
	//no arg constructor
	public FlyingVehicle(){}
	//custom constructor
	public FlyingVehicle(short wings, Engine engine) {
		this.wings = wings;
		this.engine = engine;
	}
	//getters and setters for wings and engine
	public short getWings() {
		return wings;
	}
	public void setWings(short wings) {
		this.wings = wings;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//void statements for different tasks
	public void fly() {
		System.out.println("Flying vehicle is flying..");
	}
	
	public void refuel() {
		System.out.println("Flying vehicle is refueling...");
	}
	
	public void liftOff() {
		System.out.println("Flying Vehicle is lifting off...");
	}
	
	public void land() {
		System.out.println("Flying Vehicle is landing...");
	}

}
