package argumentMethods1;

public class BookMyShow {
static double totalAmount;

void ticket(double ticket1, double ticket2)
{
	System.out.println("Row 1 price is:"+ticket1);
	System.out.println("Row 2 price is:"+ticket2);
	totalAmount = ticket1 + ticket2;
	System.out.println("Total price:"+totalAmount);
}

void paymentMode(SBI i)
{
	System.out.println("------- Fetching payment ------");
	i.accBal = i.accBal - totalAmount;
	System.out.println("Trnsaction Completed");
}

void paymentMode(HDFC h)
{
	System.out.println("------- Fetching payment ------");
	h.accBal = h.accBal - totalAmount;
	System.out.println("Trnsaction Completed");
}
}
