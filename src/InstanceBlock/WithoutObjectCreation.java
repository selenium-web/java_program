package InstanceBlock;

public class WithoutObjectCreation {
	
	int id;
	String name;
	static String city="Pune";
	
	{
		id=4;
	}
	
	WithoutObjectCreation()
	{
		System.out.println("child class");
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("main" +city);
	}
	
	
	
	void dispaly()
	{
		System.out.println(id+" "+name+" "+city);
	}
	
	{
		System.out.println("instance block 1 ");
	}
	

}
