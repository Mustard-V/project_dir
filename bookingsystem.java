package ass1;

import java.util.ArrayList;

public class bookingsystem {
		//list of customer-->include booking
		//booking 
		//list of hotel
		ArrayList<Customer> customers;
		ArrayList<Booking> bookings;
		ArrayList<Hotel> Hotels;
		public bookingsystem() {
			this.customers = new ArrayList<Customer>();
			this.bookings = new ArrayList<Booking>();
			this.Hotels = new ArrayList<Hotel> ();
		}
		public void setcustomer(Customer c) {
			customers.add(c);
			
		}
		public void setbooking(Booking b) {
			bookings.add(b);
			
		} 
		public void setHotel(Hotel h) {
			Hotels.add(h);
			
		}
		
		//compare give time can be add in the m?
		public boolean check_room_periods(Room m, period p) {
			for(Booking b1: m.getbookings()) {
				period p1 = b1.getperiod();
				if(p.getCustomer() != p1.getCustomer()) {
					if(p.getstartdate().isAfter(p1.getstartdate()) && p.getstartdate().isBefore(p1.getenddate())) {
						return false;
					}
					if(p.getstartdate().isBefore(p1.getstartdate()) && p.getenddate().isAfter(p1.getenddate())) {
						return false;
					}
					if(p.getenddate().isAfter(p1.getstartdate()) && p.getenddate().isBefore(p1.getenddate())) {
						return false;
					}
				}
			}
			return true;
		}
		
		///I need some function below, include make booking, change booking and cancel booking of customer
		//all true print customer's information
		//false return reject
		public boolean makebooking(Customer a, Booking b, ArrayList<Hotel> Hotels) {
			Booking new1 = b;
			String bookingtype = b.getRoomtype();
			for(Hotel currhotel:Hotels) {
				for(Room currroom:currhotel.getroom()) {
					//System.out.println(currroom.getType());
					//System.out.println(b.getRoomnumber());
					if(currroom.getType().equalsIgnoreCase(bookingtype)) {
						
						if(check_room_periods(currroom, new1.getperiod()) == false) {
							if( !a.getBookings().isEmpty()) {
								cancelbooking(a,Hotels);
								return false;
							}
							
						}
					
						if(check_room_periods(currroom, new1.getperiod()) == true) {
							currroom.setbooking(b);
							new1.setRoomnumber(currroom.getRoomnumber());
							a.setBookings(new1);
							a.setHotel(currroom.getHotel());
							return true;
	
						}
						
					}
				}
			}
			return false;
		}
		public String printcustomerbooking(Customer a) {
			Customer curr = a;
			String result = "Booking ";
			result.concat(curr.getName());
			
			result.concat(curr.getHotel());
			for(Booking p:curr.getBookings()) {
				result.concat(p.getRoomnumber());
			}
			return result;
		}
		/*
		public void changebooking() {
			//return null;
			//œ»free‘Ÿenroll
		}
		*/
		/**************************************************
		 * need check?????????????????????????????
		 * ***************************************************/
		public void cancelbooking(Customer a,ArrayList<Hotel> Hotels) {
			/*
			for(Booking curr:a.getBookings()) {
				a.getBookings().remove(curr);
			}
			*/
			a.getBookings().clear();
			for(Hotel currhotel:Hotels) {
				for(Room currroom:currhotel.getroom()) {
					for(Booking p:currroom.getbookings()) {
						if(p.getCustomer().equals(a.getName())) {
							currroom.getbookings().remove(p);
						}
					}
				}
			}
			//free from the room list
			//return null;
		}
		public String print_booking_of_customer(String name,ArrayList<Hotel> Hotels) {
			String a = ("Booking ");
			//a + ("Booking ");
			//return a;
			
			a = a+name;
			a =a+" ";
			for(Hotel currhotel:Hotels) {
				for(Room currroom:currhotel.getroom()) {
					for(Booking currbooking: currroom.getbookings()) {
						if(name.equalsIgnoreCase(currbooking.getCustomer())) {
							a = a+currroom.getRoomnumber();
							a = a+ " ";
						}
					}
				}
			}
			return a;
			
		}
		public String printhotel(Hotel h) {
			String a = "";
			a.concat(h.getHotelname());
			for(Room curr:h.getroom()) {
				if(!curr.getbookings().isEmpty()) {
					a.concat(curr.getRoomnumber());
				}
			}
			return a;
		}

}
