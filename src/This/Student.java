package This;

public class Student {
	
	String name;
	int id;
	int pinCode;
	String city;
	Address address;
	
	Student(String name,int id,int pinCode,Address address) {
		this.name=name;   // // this is used to refer current class instance variables i.e to differentiate 
		// between instance variables and local variables..
		this.id=id;
		this.pinCode=pinCode;
		this.address=address;
	}
	
	Student(String name,int id,int pinCode,String city,Address address) {
		// Call to this() must be the first statement in constructor.
		this(name, id, pinCode,address);  // this is used to call current class constructor.
		this.city=city;
		
	}
	
	void dispaly(){
		
		this.show();		  // this is used to call current class method.
	}
	
	void show(){
		
		System.out.println(name+" "+id+" "+pinCode+" "+city+" "+address.state+" "+address.country);
		
	}
	
	Student get()  // get method is use to return current class instance / object. 
	{
		return this;
		
	}

}
