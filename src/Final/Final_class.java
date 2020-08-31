package Final;

public class Final_class {
	
	final int id;
	final int roll;
	final String name="Abhi";
	String city;
	static final String country;
	
	Final_class(int id)
	{
		// final veriables should be initialized inside the constructor only.
		this.id=id;
		roll=66;
	}
	
	static
	{
		// static final variables should be initialized inside the static block only.
		country="India";
	}
	
	final void display()
	{
		System.out.println(id+" "+roll+" "+name+" "+city+" "+country);
	}
	
	final void show()
	{
		System.out.println("final method");
	}
	
}
