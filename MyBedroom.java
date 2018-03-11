package JavaHomework7;

public class MyBedroom {

	public static void main(String[] args) {
		Dimensions d=new Dimensions(20,24);
		Window thewindow=new Window("square",d,"glass");
		Bed thebed=new Bed("Ikea", 20,"memory foam");
		Closet thecloset=new Closet(5,231,2);
		HouseRoom room=new HouseRoom(thewindow, thecloset, thebed);
		room.Sleep();
		room.UseCloset();
		room.UseWindow();
		thecloset.AvgclosetArea(200);
		//System.out.println(thecloset.getArea());
		

	}

}
