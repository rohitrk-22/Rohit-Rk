package argumentMethods;

public class DMart
{
	double totalAmount;
		
		void purchase (double product1, double product2)
		{
			System.out.println("Product 1 price :"+ product1);
			System.out.println("Product 2 price :"+ product2);
			totalAmount = product1+product2;
			
			System.out.println("Total Amount :"+totalAmount) ;
		}
		
		public void makePayment(ICICI i1)
		{
			System.out.println("----------- making payment ------");
			System.out.println("Total Amount is :"+totalAmount) ;
			i1.accBal = i1.accBal-totalAmount;
		}
}

	
