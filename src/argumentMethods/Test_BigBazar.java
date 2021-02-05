package argumentMethods;

public class Test_BigBazar {

	public static void main(String[] args) {
		IDBI i2 = new IDBI();
		i2.avlBal();
		BigBazar b = new BigBazar();
		b.buy(500.0, 500.0);

		b.paymentMode(i2);
		System.out.println("--------------------------------");
		i2.avlBal();
	}
}