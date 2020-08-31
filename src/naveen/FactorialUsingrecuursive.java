package naveen;

public class FactorialUsingrecuursive {
	
	public static void main (String[] args )
	{
		factorial(5);
		System.out.println("fact is "+ fact(5));
	}

public static void factorial (int num)
	{
		int fact=1;
	   if(num==0)
	   {
		   System.out.println(1);
	   }
	
	   else
	   {
	
		for (int i=num;i>0;i-- )
		{
			fact=fact*i;
			
		}
		
		System.out.println("factorial is "+fact);
	}
	   }

	public static int fact(int num)
	{	
		if(num==0 )
		{
			return 1;
		}
		else
	{
	     return (num * fact(num-1));
	   }	
}
} 