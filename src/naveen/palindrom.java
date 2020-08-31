package naveen;

public class palindrom {

	public static void main(String[] args) {
		isPalindromNuber(131);
		
	}
		// TODO Auto-generated method stub
		
		public static void isPalindromNuber(int num)
		{
			
			int rev = 0;
			int t=num;
			
			while(num>0)
			{
				rev=rev*10+num%10;
				num=num/10;
				
			}
			
			if (t==rev)
			{
				System.out.println("number is pallindrom number");
			}
			else 
			{
				System.out.println("number is not pallindrom number");
			}
		
			}		
	}

