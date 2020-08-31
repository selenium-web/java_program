package Static;

public class Static_block {
	
	static int roll;
	static String name;
	
	static  // static block execute before main method at the time of class loading
	{
		roll=44;     // static block is used to initialize the static data members.
		name="Abhi";
	}
	
	public static void main(String[] args)
	{
		System.out.println(roll+" "+name);
	}
	
	public void use()
	{
		System.out.println(roll+" "+name);
	}

}
