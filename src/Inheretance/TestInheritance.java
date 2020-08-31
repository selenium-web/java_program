package Inheretance;

public class TestInheritance {

	public static void main(String[] args) {
		
		Dog d=new Dog(); // child class reference can hold child class object. 
		d.eat();
		d.bark();
		d.show();
		
		Animal a=new Dog();  // parent class reference can hold child class object. 
		a.eat();   // only parent class methods are accessible
//		a.testing(); // compile time error
//		a.bark();  // parent class reference with child class object we can not call child class method
		a.show();
		
// 		Dog d=new Animal(); // error : child class reference can not hold parent class object. 
		
		BabyDog bd=new BabyDog(); // child class reference veriable hold child class object, we can call all the child as well as parent class methods till parent to parent class also.
		bd.weep();
		bd.bark();
		bd.eat();
		bd.show();
		
		Dog d1=new BabyDog();
		d1.bark();  // parent class method
		d1.eat();  // parent to parent class method 
// 		d1.weep();  // parent class reference with child class object we can not call child class method
		d1.show();
		
		Cat c=new Cat();
		c.mawow();
		c.eat();
//		c.bark(); // Dog class not accessible 
		
		Address address = new Address("pune","MH","India");

		Student student = new Student("abhi",31,address);
		System.out.println(student.name);
		System.out.println(address.city);	
		student.display();
		
		
//		Address address1 = new Address(); // you can create obj with default constructor
//		Student student = new Student("abhi",31,address);
//		System.out.println(student.name);
//		System.out.println(address.city);	
//		student.display();
	} 
	

	

}
