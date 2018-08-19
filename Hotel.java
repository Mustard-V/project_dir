package ass1;

import java.util.ArrayList;



public class Hotel {
	
	private String Hotelname;
	private ArrayList<Room> rooms;
	
	public Hotel(String Hotalname) {
		this.Hotelname = Hotalname;
		this.rooms = new ArrayList<Room>();
	}

	public String getHotelname() {
		return Hotelname;
	}
	public void setHotelname(String hotelname) {
		Hotelname = hotelname;
	}
	public void setroom(Room room) {
		rooms.add(room);
	}
	public ArrayList<Room> getroom(){
		return  rooms;
	}

	@Override
	public String toString() {
		return "Hotel [Hotelname=" + Hotelname + ", rooms=" + rooms + "]";
		//need change
	}
	
}

