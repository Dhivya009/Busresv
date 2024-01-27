package busresveration;



	import java.util.ArrayList;

	public class Bus {
	       private int busNo;
	       private boolean ac;
	       private int capacity;
	       private String startingPlace;
	       private String endingPlace;
	    
	       Bus(int No,boolean ac,int cap, String startPlace,String endPlace){
	             
	             this.busNo=No;
	             this.ac=ac;
	             this.capacity=cap;
	             this.startingPlace=startPlace;
	             this.endingPlace=endPlace;
	       }
	       public int getcapacity() {
	    	   return capacity;
	       }
	       public void setcapacity(int cap) {
	    	   this.capacity=cap;
	       }

		public int getBusNo() {
			return busNo;
		}

		public boolean isAc() {
			return ac;
		}
		public void setAc(boolean ac) {
			this.ac = ac;
		}
		public String getStartingPlace() {
			return startingPlace;
		}
		public void setStartingPlace(String startingPlace) {
			this.startingPlace = startingPlace; 
		}
		public String getEndingPlace() {
			return endingPlace;
		}
		public void setEndingPlace(String endingPlace) {
			this.endingPlace = endingPlace;
		}
		
		 public void displayBusInfo() {
	   	  System.out.println("Bus No: " + busNo + "AC:" + ac + "Capacity :"+ capacity + " Startingplace  :"+
		  startingPlace + "EndingPlace :" + endingPlace );
	     }
		
		}
	   	 


