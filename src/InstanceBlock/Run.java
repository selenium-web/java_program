package InstanceBlock;

public class Run {

	public static void main(String[] args) {
		
		InstanceClass ic=new InstanceClass("Gayatri");
		ic.dispaly();

	}
}
	
	// actual flow of object creation and instance block calling
	
//		InstanceClass(String name)
//		{
//			super();   // parent class constructor 
//			id=4;
//			System.out.println("instance block 1 ");
//			System.out.println("instance block 3 ");
//			System.out.println("child class");
//			this.name=name;
//		}


