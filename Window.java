package JavaHomework7;

public class Window {
private String shape;
private Dimensions dimensions;
private String material;
public Window(String shape,Dimensions dimensions, String material){
	this.shape=shape;
	this.dimensions=dimensions;
	this.material=material;
}
public void Ventilation(){
	System.out.println("Window mantains ventilation in the room");
	

}
public void shutWindow(){
	System.out.println("Shut window when going to sleep");
	
}
public String getShape() {
	return shape;
}
public void setShape(String shape) {
	this.shape = shape;
}
public Dimensions getDimensions() {
	return dimensions;
}
public void setDimensions(Dimensions dimensions) {
	this.dimensions = dimensions;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}}
