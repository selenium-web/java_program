package Access_Modifier1;

import Access_Modifier.Private_class;

public class Protected_class extends Private_class{

	public static void main(String[] args) {
		
		Private_class pc=new Private_class(); // protected variables and methods can not be access in child
		// class of outside package if we create object of parent class.
		
		pc.country="India";  
		pc.hide();
		
		// protected variables and methods can be access in child
	//  class of outside package if we create object of child class.
		
		Protected_class pc4=new Protected_class(); 
		pc4.country="India";  
		pc4.hide();
	}

}
