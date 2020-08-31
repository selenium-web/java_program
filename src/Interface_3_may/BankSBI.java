package Interface_3_may;
// one class can implement multiple interfaces
public class BankSBI implements Banking,Drawable{
	
	public int getROI()
	{
		System.out.println("4");
		return 4;
	}
	
	public void draw()
	{
		System.out.println("drawing");
	}

}
