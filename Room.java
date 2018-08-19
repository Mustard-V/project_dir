package ass1;

import java.util.ArrayList;

//import java.util.ArrayList;


public class Room {
	private String Hotel;
	private String roomnumber;
	private String capacity;
	private String type;
	private String status;//if some one will in the room
	//add period compare to the new arrange
	private ArrayList<Booking> bookings;
	///////////////////////////////////////////////////////////////
	public Room(String hotel,String roomnumber, String capcity) {
        this.roomnumber = roomnumber;
        this.capacity = capcity;
        this.type = "haven't enter";
        this.status = "empty";
        this.Hotel = hotel;
        this.bookings = new ArrayList<Booking>();
        //this.type = "double";
    }
	/**
	 * @return the room number
	 */
	public String getRoomnumber() {
		return roomnumber;
	}
	/**
	 * @param roomnumber the room number to set
	 */
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	/**
	 * @return the capacity
	 */
	public String getCapcity() {
		return capacity;
	}
	/**
	 * @param capcity the capacity to set
	 */
	public void setCapcity(String capcity) {
		this.capacity = capcity;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public void setbooking(Booking p) {
		bookings.add(p);
	}
	public ArrayList<Booking> getbookings(){
		return bookings;
	}
	@Override
	public String toString() {
		return "Room [roomnumber=" + roomnumber + ", capacity=" + capacity + ", type=" + type + ", status=" + status
				+ "]";
	}
	/**
	 * @return the hotel
	 */
	public String getHotel() {
		return Hotel;
	}
	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(String hotel) {
		Hotel = hotel;
	}
	
	
}
