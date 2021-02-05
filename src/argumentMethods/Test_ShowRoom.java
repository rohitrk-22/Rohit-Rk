package argumentMethods;

public class Test_ShowRoom {

	public static void main(String[] args) {

		ShowRoom showroom = new ShowRoom();
		TATA t = new TATA();
		AXIS a = new AXIS();

		a.checkBal();
		showroom.buyTataCar(t, a);
		System.out.println("--------------------------------------");
		HONDA h = new HONDA();
		a.checkBal();
		showroom.buyHONDACar(h, a);
	}
}