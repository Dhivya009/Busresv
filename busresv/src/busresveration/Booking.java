
package busresveration;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class Booking {
	String passangerName;
	String passangerNumber;
	int busNo;
	int seatNo;
    Date date;
    
	Booking(){
		
		Scanner sc =new Scanner(System.in);
		
        System.out.println("Enter the PssangerName:");
        passangerName =sc.next();
        System.out.println("Enter the PassangerNumber:");
        passangerNumber =sc.next();
        System.out.println("Enter the BusNo:");
        busNo =sc.nextInt();
        System.out.println("Enter the SeatNo:");
        seatNo = sc.nextInt();
        System.out.println("Enter the Date dd-MM-yyyy:");
        String dateInput =sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
		date = dateFormat.parse(dateInput);
	}
		catch(ParseException e) {
			e.printStackTrace();
		}
	}
	public boolean isAvaialable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
		int capacity =0;
		for(Bus bus :buses) {
			if(bus.getBusNo()==busNo) {
				capacity = bus.getcapacity();
			}
		}
			int booked=0;
			for(Booking b:bookings) {
				if(b.busNo==busNo && b.date.equals(date) && b.seatNo==seatNo) {
					booked++;
				}
			}
		
			return booked<capacity?true:false;	
		}
}
