package jasen.model;

public class Simulation {

	public static void main(String[] args) {
		
		FlyingVehicle fv = new FlyingVehicle((short)4,new Engine());
		
		fv.setName("A New Flying Vehicle");
		
		System.out.println(fv.getName());
		
		Airplane boeing = new Airplane((short)4, (short)5);
		boeing.move(15);
		boeing.getEngine();
		boeing.liftOff();
		boeing.fly();
		boeing.refuel();
		boeing.turn();
		boeing.move(20);
		boeing.land();

	}

}
