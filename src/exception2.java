
public class exception2 {
	
	public static void main(String[] args)  {
		
		display();
	}

	
	 public static void display() 
	{
		show();
		System.out.println();
	}
	
	 static void show() 
	{
		 int i= 99/0;   // throws keyword is not use in case of unchecked exception. it gives exception AE at runtime.
		System.out.println(i);
	}
}
