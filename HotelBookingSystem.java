package ass1;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
//最后要加close关闭文件
public class HotelBookingSystem {
	public static void main(String[] args) {
		bookingsystem sys = new bookingsystem(); 
		Scanner sc = null;
		try {
			sc = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(sc.hasNextLine()) {
			String thisline = sc.nextLine();
			String[] lines = new String[100];
			lines = thisline.split(" ");

			if(lines[0].equalsIgnoreCase("Hotel")) {							
				String hotelname = lines[1];
				String roomnumber = lines[2];
				String capacity = lines[3];
				String type = null;
				if(capacity.equals("1")){
					type = "single";
				}
				if(capacity.equals("2")){
					type = "double";
				}
				if(capacity.equals("3")){
					type = "triple";
				}
				int i = 0;
				for(Hotel curr:sys.Hotels) {
					if(curr.getHotelname().equalsIgnoreCase(hotelname)) {
						i = 1;//find
						Room  room  = new Room(hotelname,roomnumber,capacity);
						room.setType(type);
						curr.setroom(room);
						//System.out.println(curr.toString());
						break;
					}
					
				}
				if(i==0) {
					Hotel hotel = new Hotel(hotelname);
					Room  room  = new Room(hotelname,roomnumber,capacity);
					room.setType(type);
					hotel.setroom(room);
					sys.Hotels.add(hotel);
					//System.out.println(hotel.toString());
				}
				
			}
			for(Hotel e:sys.Hotels) {
				System.out.println(e.toString());
			}
			//do customer booking
			if(lines[0].equalsIgnoreCase("Booking")) {
				String customer = lines[1];
				String month1 = lines[2];
				String date1  = lines[3];
				String night1 = lines[4];
				int month = 0;
				switch(month1) {
				case("Jan"): month = 1;
				case("Feb"): month = 2;
				case("Mar"): month = 3;
				case("Apr"): month = 4;
				case("May"): month = 5;
				case("Jun"): month = 6;
				case("Jul"): month = 7;
				case("Aug"): month = 8;
				case("Sep"): month = 9;
				case("Oct"): month = 10;
				case("Nov"): month = 11;
				case("Dec"): month = 12;				
				}
				//System.out.println("1");
				int date = Integer.parseInt(date1);
				int night = Integer.parseInt(night1);
				LocalDate startdate = LocalDate.of(2018,month, date);
				period bookingperiod = new period(customer,startdate,night);
				Customer a = new Customer(customer);
				int point = 0;//check if all booking can be added.0 success, 1 failed.
				//System.out.println("2");
				//System.out.println(sys.print_booking_of_customer(customer,sys.Hotels));
				switch(lines[5]) {
					case("double"):
						String number1 = lines[6];
						//System.out.println("number1");
						//System.out.println(number1);
						int number = Integer.parseInt(number1);
						int i = 0;
						//System.out.println("number=");
						//System.out.println(number);
						while(i<number) {
							Booking b = new Booking(customer,month1,date, night, bookingperiod,lines[5]);
							//System.out.println("3");
							sys.makebooking(a, b, sys.Hotels);
							System.out.println("4");
							if(sys.makebooking(a, b, sys.Hotels) == false) {
								//System.out.println("5");
								System.out.println("Booking rejected\n");
								point = 1;
								break;
							}
							i++;
							if(sys.makebooking(a, b, sys.Hotels) == true) continue;
							
							
						}
						
					case("single"):
						String number2 = lines[6];
						int number4 = Integer.parseInt(number2);
						int j = 0;
						while(j<number4) {
							Booking b = new Booking(customer,month1,date, night, bookingperiod,lines[5]);
							if(sys.makebooking(a, b, sys.Hotels) == false) {
								System.out.println("Booking rejected\n");
								point = 1;
								break;
							}
							j++;
							if(sys.makebooking(a, b, sys.Hotels) == true) continue;
						}
						
						
					case("triple"):
						String number3 = lines[6];
						int number5 = Integer.parseInt(number3);
						int k = 0;
						while(k<number5) {
							Booking b = new Booking(customer,month1,date, night, bookingperiod,lines[5]);
							if(sys.makebooking(a, b, sys.Hotels) == false) {
								System.out.println("Booking rejected\n");
								point = 1;
								break;
							}
							k++;
							if(sys.makebooking(a, b, sys.Hotels) == true) continue;
						}
						
				}
				
				System.out.println(sys.print_booking_of_customer(customer,sys.Hotels));
			}
			//do the cancel
			if(lines[0].equalsIgnoreCase("Cancel")) {
				String customer = lines[1];
				//use function in the bookingsystem(cancelbooking)
				System.out.println("Cancel "+customer);
			}
		}
		/*
		finally {
	      
	          if (sc != null) sc.close();
	    }
	    */
	}
 
        
 
}
