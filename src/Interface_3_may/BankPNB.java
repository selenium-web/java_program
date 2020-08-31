package Interface_3_may;

public class BankPNB implements Bike,Printable,Showable{
	
	public int getROI()
	{
		System.out.println("5");
		return 5;
	}
	
	public void run()
	{
		System.out.println("run safely");
	}
	
	public void print()
	{
		System.out.println("printing");
	}
}
