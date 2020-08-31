//package naveen;
//
//public class ReverseString
//{
//	public static void main (String[] args)
//	{
//		String s = "Selenium";
//		int len = s.length();
//		String rev = "";
//		
//		for (int i=len-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
//	}
//}

package naveen;

public class ReverseString
{
	public static void main (String[] args)
	{
		
		String s="selenium";
		int len=s.length();
		System.out.println(len);// 8 ---  0 to 7 
		String rev="";

		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
				
//		String s = "Selenium";
//		StringBuffer sf = new StringBuffer(s);
//		System.out.println(sf.reverse());
				
	}	
	}
