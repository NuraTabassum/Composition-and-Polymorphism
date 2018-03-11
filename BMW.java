package JavaHomework7;

public class BMW extends CarParent {
private String name;
private int cylinder;
public BMW(){
	super();
	name="M3";
	cylinder=6;}
			
	public void display(){
		System.out.println("Car name: "+getName());
		System.out.println("Car Cylinder: "+getCylinder());
		super.display();
		
	}
	
	
	//BMW(String nm, boolean b, int i, int w) {
		//super(nm, b, i, w);
		// TODO Auto-generated constructor stub
	
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCylinder() {
	return cylinder;
}
public void setCylinder(int cylinder) {
	this.cylinder = cylinder;
}

@Override
	public void accelerate()
	{
		super.accelerate();
		System.out.println("acceleration speeds up the car");
	}

	}

	

	


