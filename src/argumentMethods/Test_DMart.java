package argumentMethods;

public class Test_DMart 
{
   public static void main(String[] args) 
   {
	   ICICI i1 = new ICICI();
	   i1.checkBal();
	   System.out.println("-------------------");
	   DMart samba = new DMart();
	   samba.purchase(50.0, 150.0);
	   
	   samba.makePayment(i1);
	   
	   System.out.println("-------------");

	   i1.checkBal();
   }
}
