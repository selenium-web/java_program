package oops_concept;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("puppy" );
		d.eat();
		d.dogname();
		System.out.print(d.name);
		d.bark();
		System.out.println(d.ownerName);
		
		Animal a1=new Animal("ronald");
		System.out.println(a1.name);
		a1.eat();
		a1.dogname();
		
		Animal a3=new Dog("pen");
		a3.eat();
		a3.dogname();
		
//		Dog d1=new Animal("ronald");  // not valid 
		

	}

}
