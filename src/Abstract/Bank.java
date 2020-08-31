package Abstract;

public abstract class Bank {
	
	static String city ="Pune";
	
	Bank(String place)
	{
		this.city=place;
	}
	
	Bank()
	{
		System.out.println("constructor");
	}
	
	public void printAmount()
	{
		System.out.println("amount is 555");
	}
	
	static void changeCity()
	{
		city="AKOLA";
		System.out.println("city change" +city);
	}
	
	final void finalMehtod()
	{
		System.out.println("finalMehtod");
	}
	
	public abstract int getRateOfInterest();

}
