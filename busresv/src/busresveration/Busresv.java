package busresveration;

import java.util.ArrayList;
import java.util.Scanner;

public class Busresv {



	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(101,true ,2,"chennai","cuddalore"));
		buses.add(new Bus(307,false,50,"trichy","cuddalore"));
		buses.add(new Bus(560,false,60,"chennai","coimbatore"));
		buses.add(new Bus(906,true,35,"coimbatore","cHennai"));
		buses.add(new Bus(890,true,55,"neyveli","chennai"));
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvaialable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
		}
	}

}