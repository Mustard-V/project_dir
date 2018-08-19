package ass1;
/*what I need to fo is get the information of booking 
as booksys
	|
	|
	|
booking(inlcude custumer name,time ,homany night)
*/



public class Booking {
	private String roomnumber;
	private String month;
	private int date;
	private String customer;
	private String roomtype;
	private int night;
	private period periods;
	private String hotelname;
	public Booking(String customer, String month, int date, int days,period p,String type) {
		this.setCustomer(customer);
		this.setMonth(month);
		this.setDate(date);
		this.setNight(days);
		this.periods = p;
		this.roomtype = type; 
	}
	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}
	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	/**
	 * @return the roome
	 */
	public String getRoomtype() {
		return roomtype;
	}
	/**
	 * @param roomes the roomes to set
	 */
	public void setRoomtype(String roomes) {
		this.roomtype = roomes;
	}
	/**
	 * @return the night
	 */
	public int getNight() {
		return night;
	}
	/**
	 * @param night the night to set
	 */
	public void setNight(int night) {
		this.night = night;
	}
	
	public period getperiod(){
		return periods;
	}
	/**
	 * @return the room
	 */
	/**
	 * @return the roomnumber
	 */
	public String getRoomnumber() {
		return roomnumber;
	}
	/**
	 * @param roomnumber the roomnumber to set
	 */
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	/**
	 * @return the hotelname
	 */
	public String getHotelname() {
		return hotelname;
	}
	/**
	 * @param hotelname the hotelname to set
	 */
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
}