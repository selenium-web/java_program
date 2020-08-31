package InstanceBlock;

public class InstanceClass extends Parent {
	
	int id;
	String name;
	static String city="Pune";
	
	{
		id=4;
	}
	
	InstanceClass(String name)
	{
		super();
		System.out.println("child class");
		this.name=name;
	}
	
	
	
	
	
	void dispaly()
	{
		System.out.println(id+" "+name+" "+city);
	}
	
	{
		System.out.println("instance block 1 ");
	}
	
	{
		System.out.println("instance block 3");
	}
}
