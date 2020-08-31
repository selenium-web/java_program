package naveen;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isArmstrong(407);
		isArmstrong(47);

	}
	
	public static void isArmstrong(int num )
	{
		int rem=0;
		int t=num;
		int cube=0;
		
		while(num>0)
		{
			rem=num%10;
			cube=cube+(rem*rem*rem );
			num=num/10;
			
		}
		
		if (t==cube)
		{
			System.out.println("number is armstrong number");
		}
		else 
		{
			System.out.println("number is not armstrong number");
		}
	}

}
