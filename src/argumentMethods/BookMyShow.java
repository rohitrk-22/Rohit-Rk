package argumentMethods;

public class BookMyShow 
{
	static double totalAmount = 0.0;

	void ticket(double ticket1, double ticket2) {
		System.out.println("Row 1 price is:" + ticket1);
		System.out.println("Row 2 price is:" + ticket2);
		totalAmount = ticket1 + ticket2;
		System.out.println("Total Price:" + totalAmount);
	}

	void paymentMode(SBI i) 
	{
		System.out.println("-----Fetching Payment------");
		i.accBal = i.accBal - totalAmount;
		System.out.println("Transaction Completed");
	}

	void paymentMode(HDFC h) 
	{
		System.out.println("-----Fetching Payment------");
		System.out.println("Total Amount is:" + totalAmount);
		h.accBal = h.accBal - totalAmount;
		System.out.println("Transaction Completed");
	}
}