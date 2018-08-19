package ass1;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Booking> Bookings;
	private String hotel;//需要去printf方便
	public Customer(String name) {
		this.setName(name);
		this.Bookings = new ArrayList<Booking>() ;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the bookings
	 */
	public ArrayList<Booking> getBookings() {
		return Bookings;
	}

	/**
	 * @param bookings the bookings to set
	 */
	public void setBookings(Booking bookings) {
		this.Bookings.add(bookings) ;
	}

	/**
	 * @return the hotel
	 */
	public String getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	
}
