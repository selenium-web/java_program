package Access_Modifier;

public class private3 {

	public static void main(String[] args) {

   Private_class pc1= new Private_class(); // object created as both classes are public.
   
   pc1.name="Raj";   // // as name is default variable, it can be access within package.
   pc1.id;  // // as id is private variable, it can not be access outside class.
  pc1.display(); // // as display is private method, it can not be access outside class.
   pc1.show();  // as show is default method, it can be access within package. 
   
   Private_class pc1= new Private_class("Amravati"); // as constructor is private,it can not be access
  // outside class.
   
   Default_class dc=new Default_class();  // we can create object as it is default constructor.
   
 pc1.country="India"; // protected variable is acceass within package.
 pc1.hide(); // protected method is acceass within package.

	}

}
