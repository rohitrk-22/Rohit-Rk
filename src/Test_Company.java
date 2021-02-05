class Company
{
	// static Global Variable
	
	static String name = "Faurecia";
	
	//Non-Static Global Variable
	
	String dname1="Interior";
	String dname2="Seating";
}
// main class

 public class Test_Company
 {
	 public static void main(String[] args) 
	 {
		 //Local Variable
		 
		 String a = "Creta";
		 
		 //Object Creation
		 
		Company C1 = new Company (); //class call+Reference Object
		
		  System.out.println("Hyundai");
		  System.out.println("Client:"+ Company.name);
		  System.out.println("Department1:"+ C1.dname1);
		  System.out.println("Department2:"+ C1.dname2);
		  System.out.println("Model:"+ a);
		  
		  // De-Reference object
		  System.out.println("Department1:"+ new Company().dname1);
		 
		  C1.dname2="Body In White";
		  
		  System.out.println("Department3:"+ C1.dname2);
		  
		  System.out.println("Link1:"+ new Company());
		  		 		  		  		  		  		  		  		 		
	}
 	
}
