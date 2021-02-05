package argumentMethods;

public class ShowRoom {

	public void buyTataCar(TATA t, AXIS a) {
		System.out.println("Buying TATA car");
		System.out.println("Car name :" + t.name + " and price:" + t.price);
		makePayment(a, t.price);
	}
	public void buyHONDACar(HONDA h, AXIS a) {
		System.out.println("Buying HONDA car");
		System.out.println("Car name :" + h.name + " and price:" + h.price);
		makePayment(a, h.price);
	}
	void makePayment(AXIS a, double price) {
		System.out.println("Make payment");
		a.accBal = a.accBal - price;
		System.out.println("Purchase complete!");
		a.checkBal();
	}
}