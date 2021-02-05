
 class Sample1 
{
	 
	public static void main(int[] args) 
	{
		
		System.out.println("running int-arg main method");		
    }
	public static void main(String[] args) 
	{
		System.out.println("running String-arg main method");
		
		int[] i= {10};
		main(i);
		
		
	
			
	}
	public static void main(double[] args)
	{
		System.out.println("running double-arg main method");
	}
		
 }
