package JavaHomework7;

public class Closet {
	private int shleves;
	private int area;
	private int hangingSlot;
	public Closet(int shelves, int area,int hangingSlot){
		this.shleves=shelves;
		this.area=area;
		this.hangingSlot=hangingSlot;
	}
	public void storage(int s){
		System.out.println("Closet can hang "+s+" cloths");
	}
	public int getShleves() {
		return shleves;
	}

	public void setShleves(int shleves) {
		this.shleves = shleves;
	}
	public int getArea() {
		return area;
	}
	public void AvgclosetArea(int sqft){
		if(area>=sqft){
			System.out.println("Closet area approved for average room size");
			
		}else{System.out.println("Closet area is not approved for average room size");}
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getHangingSlot() {
		return hangingSlot;
	}
	public void setHangingSlot(int hangingSlot) {
		this.hangingSlot = hangingSlot;
	}

}
