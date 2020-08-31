package oops_concept;

public class Employee {
	
	int id;
	String name;
	Address address;
	
	public Employee(int id,String name,Address address) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display( )
	{
		System.out.println("id is "+id +" "+ "name is "+name);
		System.out.println("city is "+address.city +" "+ "country is "+address.country);
	}
	
	

}
