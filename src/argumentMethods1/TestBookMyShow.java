package argumentMethods1;

public class TestBookMyShow {

	public static void main(String[] args) {
		
		SBI i1 = new SBI();
		i1.checkBal();
		
		BookMyShow pvr = new BookMyShow();
		pvr.ticket(450.0, 450.0);
		
		pvr.paymentMode(i1);
		
		i1.checkBal();
		
		System.out.println("Sorry Seats are booked by other");
		System.out.println("------- Refund initiated -------");
		
		i1.accBal = i1.accBal + BookMyShow.totalAmount;
		i1.checkBal();
		
		System.out.println("-----------------------");
		
		HDFC h1 = new HDFC();
		h1.checkBal();
		
		pvr.ticket(500.0,500.0);
		pvr.paymentMode(h1);
		h1.checkBal();
		
	}

}
