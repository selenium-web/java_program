package Abstract;

public class PNB extends Bank{
	

	public int getRateOfInterest()
	{
		System.out.println("pnb");
		return 7;
	}
	
	public void display()
	{
		System.out.println("city" +city); // static veriables can be printed in child class without any object or class name
	}

}
