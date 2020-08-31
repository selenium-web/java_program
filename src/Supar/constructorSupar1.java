package Supar;

public class constructorSupar1 extends constructorSupar{

	String Email="ab";
	
	constructorSupar1(String name,int age,String email)
	{
		super(name,age);
		this.Email=email;
	}
	
	public static void main(String[] args) {
		
		constructorSupar1 su=new constructorSupar1("Rajesh",66,"abhijeet");
		System.out.println(su.name);
		System.out.println(su.age);
		System.out.println(su.Email);
		
		constructorSupar su1=new constructorSupar1("Raj",65,"abj");
		System.out.println(su1.name);
		System.out.println(su1.age);
//		System.out.println(su1.Email); // can not access child class veriable as reference is of parent class and object is of child class.
		
		
	}
	
	
}
