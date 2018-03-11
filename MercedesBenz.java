package JavaHomework7;

public class MercedesBenz extends CarParent {
	private String name;
	private int Cylinder;

	public MercedesBenz(){
		name="cls550";
		Cylinder=5;
	}
	public void display(){
		System.out.println("Car Name: "+getName());
		System.out.println("Car Cylinder: "+getCylinder());
		super.display();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCylinder() {
		return Cylinder;
	}
	public void setCylinder(int cylinder) {
		Cylinder = cylinder;
	}
	public void seat(int s){
		int sit=5;
		super.seat(s);
		System.out.println("The MercedeseBenz is "+sit+" seater");
	}

	public void brake(){
	super.brake();
}
}
