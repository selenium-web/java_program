package naveen;

public class IsPrimeNumber {

	// 2 is lowest prime number 
	
	public static void main (String[] args)
	{
	
		System.out.println(isNumberLeaaThanOne(13));
				
	}	

		public static boolean isNumberLeaaThanOne (int num)
		{
			// 1 is not prime number
			if(num<=1)
			{
				return false;
			}
			
			for(int i=2;i<num;i++)
			{
				if(num % i==0)
				{
					return false;
				}
							
			}
			
			return true;
		}
}
