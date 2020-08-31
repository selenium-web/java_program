package oops_concept;

public class Bank {

		// employye details
		
		int acc_number;
		String name;
		int amt;
		static int value;
		
	Bank ( int acc,String name1, int amtt )
	{
		acc_number=acc;
		name=name1;
		amt=amtt;
		value=amtt;
	}
		
   public void check_Balance( )
   {
	   value=value++;
	   System.out.println("Balance amount is " +amt);
   }
   
   public void WithDraw( int amount )
   {
	   if (amt < amount )
	   {
		  System.out.println("insufficent balance");
	   }
	   if (amt > amount )
	   {
		   amt=amt-amount;
		  System.out.println("amount balance after withdraw " + amt);
	   }
   }
   
	}

