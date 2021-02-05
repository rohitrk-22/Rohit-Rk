package argumentMethods;

public class BigBazar {
	double totalBill;

	void buy(double product1, double product2) {
		System.out.println("Amount of Product1:" + product1);
		System.out.println("Amount of Product2:" + product2);
		totalBill = product1 + product2;
		System.out.println("Total Bill:" + totalBill);
	}

	void paymentMode(IDBI i) {
		System.out.println("-------Making Payment------");
		i.acBal = i.acBal - totalBill;
		System.out.println("Transction Completed");
	}
}
