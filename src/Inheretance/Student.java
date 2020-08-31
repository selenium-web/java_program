package Inheretance;

public class Student {
	
	String name;
	int age=66;
	String Email="ab";
	Address address;
	
	Student(String name,int age,Address address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	void display()
	{
		System.out.println(age+" "+Email);
		System.out.println(address.country);
	}
		
}
