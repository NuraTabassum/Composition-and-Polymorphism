package JavaHomework7;

public class CarParent {
	//private String name;
	private boolean engine;
	//private int cylinder;
	private int wheels;

	CarParent() {
		//name = nm;
		engine = true;
		//cylinder = cy;
	wheels = 4;

	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public boolean isEngine() {
		return engine;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}

	/*public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}*/

	public int getWheels() {
		return wheels;
	}

	public void setWheel(int wheels) {
		this.wheels = wheels;
	}

	public void startEngine() {
		System.out.println("Start the engine");
	}

	public void accelerate() {
		System.out.println("Car gains momentum through acceleration");
	}

	public void brake() {
		System.out.println("Brake stops the car");

	}

	public void seat(int s) {
		int seat = 4;
		System.out.println("General car is " + seat + " seater");
	}
	public void display(){
		System.out.println("Car Engine: "+isEngine());
		System.out.println("Number of wheels: "+getWheels());
		
	}
}
