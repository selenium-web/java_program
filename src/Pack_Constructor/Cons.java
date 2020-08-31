package Pack_Constructor;

public class Cons {
	
	String street="pune";
	
	Cons(String name,int i)
	{	   
	//	System.out.println("constructor first statement");
	    this(5);          // we can take super(); or this(); only in first line of constructor
	  //  super();      // super(); and this() can not be available in one constructor at the sametime.
	}
	
	
	 Cons(int i)
	{
		System.out.println("constructor calling");
	}

   void Cons()           // method not constructor       // class name and method name can be same but not recomonded.
		{
			System.out.println("method testing");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cons c=new Cons(5);
	//	Cons c=new Cons();  // default constructor and user defined constructor both cannot be available at the same time.
		c.Cons();   // 
		
	}

}
