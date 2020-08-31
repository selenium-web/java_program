package Supar;

public class Student extends Address{
	
	String city="Pune";
	
	Student(){
		
		super();  // // to call parent class constructor 
			System.out.println("child class");
		
	}
	
	public void show(){
		System.out.println("child class method");
	}
	
//	super.city='amt'; // // we can not call veriable outside the method.
	

//	super.show(); // we can not call method outside the method.  method call is always inside the method.
//	super.city; // we can not call veriable outside the method.

 void dispaly(){
		super.show();  // to call parent class method
		// super is used to call parent class methodand veriable if child and parent have same method.
		
		System.out.println(this.city);
		System.out.println(super.city);  // to call parent class instance variable
		
		super.show();
		show();
		
		super.city="amt";
		System.out.println(super.city);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student s3=new Student();
		s3.dispaly();
		Address ad = new Address();
		System.out.println(ad.city);
		ad.city="ahe";
		System.out.println(ad.city);
		
	// 	super.city="shirdi"; can not use directly inside main method as it is not static. need to create object to access it.
}
}