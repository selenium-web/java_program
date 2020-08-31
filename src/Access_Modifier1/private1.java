package Access_Modifier1;

import Access_Modifier.Default_class;
import Access_Modifier.Private_class;    // class calling from other package, need to import first  

public class private1 {

	public static void main(String[] args) {
		
		Private_class pc=new Private_class(); // create a object as both class are public
		
       pc.id;  // as id is private variable, it can not be access outside class.
        pc.name;  // as name is default variable, it can not be access outside package.
        
        pc.display();  // as display is private method, it can not be access outside class.
       pc.show();  // // as show is default method, it can not be access outside class.
        
        
        Private_class pc=new Private_class("Abhay"); // as constructor is private,it can not be access outside class.

		Default_class dc=new Default_class(); // as class is default,it's constructor is also default
		// and so that it can not be access outside class.
		
		pc.country="India";  // protected variable can not be acceass outside package in parent class.
		pc.hide(); // protected method can not be acceass outside package in parent class.

	}

}
