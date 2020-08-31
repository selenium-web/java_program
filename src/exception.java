
public class exception {
	
	public static void main(String[] args)  throws InterruptedException{
		
		display();
	}

	
	 public static void display() throws InterruptedException
	{
		show();
		System.out.println();
	}
	
	 static void show() throws InterruptedException 
	{
		 Thread.sleep(4444);  // throws keyword is use in case of only checked exception
		System.out.println();
	}
}
