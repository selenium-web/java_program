package Static;

public class Main extends Counter{
	
	int roll;
	
	public static void main(String[] arg)
	{
		
        // 
     //   this.roll;   // this and super can not be use in static context.
    //    super.country;  // // this and super can not be use in static context.
		
	//	Counter.show(); // Non static veriable and method can not be use in static area.
		
		Static_Veriable st=new Static_Veriable("Karan");
		Static_Veriable st1=new Static_Veriable(44, "ARJUN");
		st.display();
        st1.display();
		
        Static_Veriable.city="Amravati"; // static variable belongs to a class other than instance of a class.
        // static veriable and methods are called using class name in other class.
        st1.display();
        st.display();
        Static_Veriable.changeCity();
       
        st.display();
        st1.display();
  
        st1.changeCityByObject();
        st1.display();
        
        // counter
        
        Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c3 = new Counter();        
        
        // calculator
        
        Counter.x=Counter.cube(6);
        c.show();
        

	}
}
