package Static;

public class Static_Veriable {
	
	static String city="Pune";  // static veritable refers to the common property of an Object. 
	// // static veriable gets memory allocated in class area only once at the time of class loading.
	int id;           // instance veriable will get memory allocated each time when object is created. 
	String name;
	
	Static_Veriable obj = new Static_Veriable("string");
	
	public Static_Veriable(String name)
	{
		this.name=name;
	}
	
	public Static_Veriable(int id, String name) {

        this(name); // this keyword is used to call the another constructor 
        this.id=id;       
	}
	
	static void changeCity()
	{
		 city="AKOLA";
	}
	
	static void changeCityByObject()
	{
		 city="Nashik";
	}
	 void display()
	{
		System.out.println(id+" "+name+" "+city);
	}

	 void test()
	 {
		 display();
	 }
}
