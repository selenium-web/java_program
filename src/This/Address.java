package This;

public class Address {
	
	String state;
	String country;
	
	Address(String state,String country)
	{
		this.state=state;
		this.country=country;
		
	}
	

	Address get()  // get method is use to return current class instance. 
	{
		return this;
		
	}

}
