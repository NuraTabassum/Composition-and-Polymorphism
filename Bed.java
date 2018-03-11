package JavaHomework7;

public class Bed {
private String manufacture;
private int model;
private String mattress;
public Bed(String manufacture, int model, String mattress){
	this.manufacture=manufacture;
	this.model=model;
	this.mattress=mattress;
}

public void mattressSize(int x, int y , String name){
	System.out.println("mattress dimensions should be "+x+" depth,"+y+" width,"+name+" size");
}
public String getManufacture() {
	return manufacture;
}
public void setManufacture(String manufacture) {
	this.manufacture = manufacture;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public String getMattress() {
	return mattress;
}
public void setMattress(String mattress) {
	this.mattress = mattress;
}

}
