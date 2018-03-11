package JavaHomework7;

public class HouseRoom {
private Window theWindow;
private Closet closet;
private Bed bed;
public HouseRoom(Window theWindow,Closet closet,Bed bed){
	this.theWindow=theWindow;
	this.closet=closet;
	this.bed=bed;
	}
	

public void Sleep(){
	theWindow.shutWindow();
	Putmattress();
	System.out.println("Sleep on bed");
	
	
}

public void Putmattress(){
	System.out.println("Put mattress on top of bed");
	bed.mattressSize(60, 80, "Queen");
}
public void UseCloset(){
	putCloths();
}
public void putCloths()
{
	closet.storage(2000);
}
public void UseWindow(){
	theWindow.Ventilation();
}
}
