class Room {
	int roomno;
	String roomtype;
	int roomarea;
	String ACmachine;
	void setData() {
		this.roomno=101;
		this.roomtype="Luxurious";
		this.roomarea=50;
		this.ACmachine="Carrier";
	}
	void displayData() {
		System.out.println("The room no is"+roomno+"The room type is "+roomtype+"The room area is "+roomarea+"The AC machine is"+ACmachine);
		
	}
}
public class HotelRoom {

	public static void main(String[] args) {
		Room r1=new Room();
		r1.setData();
		r1.displayData();
		// TODO Auto-generated method stub

	}

}
