package naveen;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num =15647893;
		long rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);

	}
 
}

// using inbuild function.

//package naveen;
//
//public class ReverseInteger
//{
//	public static void main (String[] args)
//	{
//		long num1 = 13567;
//		StringBuffer sf = new StringBuffer(String.valueOf(num1));
//		System.out.println(sf.reverse());
//				
//	}	
//	}