package oops_concept;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Bank(1,"abhi",85369 );
		b.check_Balance();
		b.WithDraw(369);	
		Bank b1=new Bank(3,"abhijeet",84369 );
		b1.check_Balance();
		b1.WithDraw(369);
		
		Balance();
		
		ThisKeyward k=new ThisKeyward(1, "abhi", 55, "science");
		k.display();

	}
	
	   public static void Balance( )
	   {
		   System.out.println("Balance");
	   }

}
