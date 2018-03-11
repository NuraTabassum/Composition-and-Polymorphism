package JavaHomework7;

public class MyFevCar {

	public static void main(String[] args) {
		
		System.out.println("BMW");
		BMW b=new BMW();
		b.display();
		
		b.accelerate();
		System.out.println("MercedesBenz");
		MercedesBenz m =new MercedesBenz();
		m.display();
		m.seat(5);
		m.brake();
		System.out.println("Tesla");
		Tesla t =new Tesla();
		t.display();
		t.startEngine();
		t.BatteryCapacity("75kwh");
		
		
	}

}
