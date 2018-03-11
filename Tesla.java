package JavaHomework7;

public class Tesla extends CarParent {
	private String name;
	private int Cylinder;
	public Tesla(){
		name="X750SUV";
		Cylinder=0;}
	public void display(){
		System.out.println("Car name: "+getName());
		System.out.println("Car Cylinder: "+getCylinder());
		super.display();
	}
		

	//Tesla(String nm, boolean b, int i, int w) {
		//super();
		// TODO Auto-generated constructor stub
	
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
	@Override
	public void startEngine(){
		super.startEngine();
		System.out.println("Egine start depends on bettery capacity");
		}
	
	public void BatteryCapacity(String c){
	String BatteryCapacity= "75kwh";
	System.out.println("Battery capacity is "+BatteryCapacity);
	super.accelerate();
}
	}
